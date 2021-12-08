package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBean2Implement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.bean.MyOperationImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * System:                 CleanBnB
 * Name:                   MyConfigurationBean
 * Description:            Class that represents a MyConfigurationBean's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Configuration
public class MyConfigurationBean
{
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }


    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
