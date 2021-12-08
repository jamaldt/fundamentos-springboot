package com.fundamentos.springboot.fundamentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * System:                 CleanBnB
 * Name:                   Post
 * Description:            Class that represents a Post's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Entity
@Table(name = "post")
public class Post
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post",nullable = false,unique = true)
    private Long id;

    @Column(name = "description",length = 255)
    private String description;

    @ManyToOne
    private User user;

    public Post()
    {
    }

    public Post(String description, User user)
    {
        this.description = description;
        this.user = user;
    }

    public Long getId()
    {
        return id;
    }

    public Post setId(Long id)
    {
        this.id = id;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public Post setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public User getUser()
    {
        return user;
    }

    public Post setUser(User user)
    {
        this.user = user;
        return this;
    }

    @Override
    public String toString()
    {
        return "Post{" +
            "id=" + id +
            ", description='" + description + '\'' +
            ", user=" + user +
            '}';
    }
}
