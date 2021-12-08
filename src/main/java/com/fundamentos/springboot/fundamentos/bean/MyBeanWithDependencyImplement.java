package com.fundamentos.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * System:                 CleanBnB
 * Name:                   MyBeanWithDependencyImplement
 * Description:            Class that represents a MyBeanWithDependencyImplement's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
public class MyBeanWithDependencyImplement implements MyBeanWithDependency
{
    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    private MyOperation _myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation)
    {
        _myOperation = myOperation;
    }

    @Override
    public void printWithDependency()
    {
        LOGGER.info("En el metodo printWithDependency ");
        int number =1;
        LOGGER.debug("el numero enviado como parametro es "+number);
        System.out.println(_myOperation.sum(number));
        System.out.println("Implementacion de un bean dentro de un bean con dependencia");


    }
}
