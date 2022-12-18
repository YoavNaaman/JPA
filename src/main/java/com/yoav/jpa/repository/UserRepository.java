package com.yoav.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yoav.jpa.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}