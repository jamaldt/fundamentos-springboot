package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

/**
 * System:                 CleanBnB
 * Name:                   ComponentImplement
 * Description:            Class that represents a ComponentImplement's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/7/21
 */
@Component
public class ComponentImplement implements ComponentDependency
{
    @Override
    public void saludar()
    {
        System.out.println("hola en componente");
    }
}
