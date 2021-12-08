package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBean2Implement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanImplement;
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
}
