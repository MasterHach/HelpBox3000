package com.example.HelpBox3000.repository;

import com.example.HelpBox3000.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
    UserEntity findByEmail(String email);
}
