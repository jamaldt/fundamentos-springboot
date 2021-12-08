package com.fundamentos.springboot.fundamentos.repository;

import com.fundamentos.springboot.fundamentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 CleanBnB
 * Name:                   UserRepository
 * Description:            Class that represents a UserRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

}
