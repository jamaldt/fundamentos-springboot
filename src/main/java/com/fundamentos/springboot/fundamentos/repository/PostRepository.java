package com.fundamentos.springboot.fundamentos.repository;

import com.fundamentos.springboot.fundamentos.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 CleanBnB
 * Name:                   PostRepository
 * Description:            Class that represents a PostRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Repository
public interface PostRepository extends JpaRepository<Post,Long>
{

}
