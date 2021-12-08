package com.fundamentos.springboot.fundamentos.bean;

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
    private MyOperation _myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation)
    {
        _myOperation = myOperation;
    }

    @Override
    public void printWithDependency()
    {
        int number =1;
        System.out.println(_myOperation.sum(number));
        System.out.println("Implementacion de un bean dentro de un bean con dependencia");


    }
}
