package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.pojo.UserPojo;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner
{

	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency _myBeanWithDependency;
	private MyBeanWithProperties _myBeanWithProperties;
	private UserPojo _userPojo;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  MyBeanWithProperties myBeanWithProperties,
								  UserPojo userPojo)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this._myBeanWithDependency = myBeanWithDependency;
		this._myBeanWithProperties = myBeanWithProperties;
		this._userPojo = userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		componentDependency.saludar();
		myBean.print();
		_myBeanWithDependency.printWithDependency();
		System.out.println(_myBeanWithProperties.function());
		System.out.println(_userPojo.getEmail() +"-"+ _userPojo.getPassword());
		LOGGER.error("este es un error");

	}
}
