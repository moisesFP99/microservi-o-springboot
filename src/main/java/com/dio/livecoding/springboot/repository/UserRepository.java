package com.dio.livecoding.springboot.repository;

import com.dio.livecoding.springboot.model.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
    
}
