package com.fundamentos.springboot.fundamentos.bean;

/**
 * System:                 CleanBnB
 * Name:                   MyBeanImplement
 * Description:            Class that represents a MyBeanImplement's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
public class MyBean2Implement implements MyBean
{
    @Override
    public void print()
    {
        System.out.println("implementacion 2 propia del bean");
    }
}
