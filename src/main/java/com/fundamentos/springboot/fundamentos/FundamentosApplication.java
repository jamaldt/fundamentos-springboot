package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.entity.User;
import com.fundamentos.springboot.fundamentos.pojo.UserPojo;
import com.fundamentos.springboot.fundamentos.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner
{

	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency _myBeanWithDependency;
	private MyBeanWithProperties _myBeanWithProperties;
	private UserPojo _userPojo;
	private UserRepository _userRepository;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  MyBeanWithProperties myBeanWithProperties,
								  UserPojo userPojo,
								  UserRepository userRepository)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this._myBeanWithDependency = myBeanWithDependency;
		this._myBeanWithProperties = myBeanWithProperties;
		this._userPojo = userPojo;
		this._userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		//ejemplosAnteriores();
		saveUsersInDB();

	}

	public void saveUsersInDB(){
		User user1 = new User("maria","miemail", LocalDate.of(2021,03,23));
		User user2 = new User("maria2","miemail", LocalDate.of(2021,04,23));
		User user3 = new User("maria4","miemail", LocalDate.of(2021,05,23));
		User user4 = new User("maria3","miemail", LocalDate.of(2021,07,23));
		User user5 = new User("maria5","miemail", LocalDate.of(2021,03,23));
		User user6 = new User("maria6","miemail", LocalDate.of(2021,10,23));
		User user7 = new User("maria7","miemail", LocalDate.of(2021,11,23));
		User user8 = new User("maria8","miemail", LocalDate.of(2020,12,23));
		User user9 = new User("maria9","miemail", LocalDate.of(2021,10,23));

		List<User> list = Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8,user9);
		list.stream().forEach(_userRepository::save);
	}

	public void ejemplosAnteriores(){
		componentDependency.saludar();
		myBean.print();
		_myBeanWithDependency.printWithDependency();
		System.out.println(_myBeanWithProperties.function());
		System.out.println(_userPojo.getEmail() +"-"+ _userPojo.getPassword());
		LOGGER.error("este es un error");
	}
}
