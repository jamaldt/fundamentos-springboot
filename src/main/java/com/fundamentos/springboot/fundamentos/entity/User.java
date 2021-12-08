package com.fundamentos.springboot.fundamentos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * System:                 CleanBnB
 * Name:                   User
 * Description:            Class that represents a User's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user",nullable = false,unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String email;

    private LocalDate birthdate;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Post> posts = new ArrayList<>();

    public User()
    {
    }

    public User(String name, String email, LocalDate birthdate)
    {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public Long getId()
    {
        return id;
    }

    public User setId(Long id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public User setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getEmail()
    {
        return email;
    }

    public User setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public User setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
        return this;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public User setPosts(List<Post> posts)
    {
        this.posts = posts;
        return this;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", birthdate=" + birthdate +
            ", posts=" + posts +
            '}';
    }
}
