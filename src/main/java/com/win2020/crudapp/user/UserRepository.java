package com.win2020.crudapp.user;

import com.win2020.crudapp.user.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}