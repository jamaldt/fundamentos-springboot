package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner
{

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency _myBeanWithDependency;
	private MyBeanWithProperties _myBeanWithProperties;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  MyBeanWithProperties myBeanWithProperties)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this._myBeanWithDependency = myBeanWithDependency;
		this._myBeanWithProperties = myBeanWithProperties;
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

	}
}
