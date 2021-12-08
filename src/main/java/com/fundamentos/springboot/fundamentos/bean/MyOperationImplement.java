package com.fundamentos.springboot.fundamentos.bean;

/**
 * System:                 CleanBnB
 * Name:                   MyOperationImplement
 * Description:            Class that represents a MyOperationImplement's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
public class MyOperationImplement implements MyOperation
{

    @Override
    public int sum(int number)
    {
        return number +1;
    }
}
