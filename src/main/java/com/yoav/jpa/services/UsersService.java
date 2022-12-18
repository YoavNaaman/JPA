package com.yoav.jpa.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoav.jpa.entity.User;
import com.yoav.jpa.repository.UserRepository;

@Service
public class UsersService implements IUserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> fetchUsersList() {
		return (List<User>) repository.findAll();
	}

	@Override
	public User updateUser(User user, Long userId) {
		 User userDB = repository.findById(userId).get();
		  
	        if (Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) {
	            userDB.setName(user.getName());
	        }
	  
	        if (Objects.nonNull(user.getCity()) && !"".equalsIgnoreCase(user.getCity())) {
	            userDB.setCity(user.getCity());
	        }
	  
	        if (Objects.nonNull(user.getStatus()) && !"".equalsIgnoreCase(user.getStatus())) {
	            userDB.setStatus(user.getStatus());
	        }
	  
	        return repository.save(userDB);
	}

	@Override
	public void deleteUserById(Long userId) {
		repository.deleteById(userId);

	}

}
