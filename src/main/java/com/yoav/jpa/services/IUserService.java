package com.yoav.jpa.services;
import java.util.List;

import com.yoav.jpa.entity.User;

public interface IUserService {

	 // save operation
    User saveUser(User user);
  
    // read operation
    List<User> fetchUsersList();
  
    // update operation
    User updateUser(User user, Long userId);
  
    // delete operation
    void deleteUserById(Long userId);
}
