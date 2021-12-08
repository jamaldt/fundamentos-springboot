package com.fundamentos.springboot.fundamentos.bean;

/**
 * System:                 CleanBnB
 * Name:                   MyBeanWithPropertiesImplement
 * Description:            Class that represents a MyBeanWithPropertiesImplement's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
public class MyBeanWithPropertiesImplement implements  MyBeanWithProperties
{
    private String name;

    private String apellido;

    public MyBeanWithPropertiesImplement(String name, String apellido)
    {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function()
    {
        return name +"-"+apellido;
    }
}
