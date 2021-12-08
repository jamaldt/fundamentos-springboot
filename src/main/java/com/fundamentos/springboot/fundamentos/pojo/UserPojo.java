package com.fundamentos.springboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * System:                 CleanBnB
 * Name:                   UserPojo
 * Description:            Class that represents a UserPojo's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "user")
public class UserPojo
{
    private String email;
    private String password;
    private String age;

    public UserPojo(String email, String password, String age)
    {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getEmail()
    {
        return email;
    }

    public UserPojo setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public String getPassword()
    {
        return password;
    }

    public UserPojo setPassword(String password)
    {
        this.password = password;
        return this;
    }

    public String getAge()
    {
        return age;
    }

    public UserPojo setAge(String age)
    {
        this.age = age;
        return this;
    }
}
