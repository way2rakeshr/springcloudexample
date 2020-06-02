package com.example.loginpoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginpoc.entity.Response;
import com.example.loginpoc.entity.User;
import com.example.loginpoc.entity.UserList;
import com.example.loginpoc.repository.UserRepository;
@Service
public class LoginServiceImpl implements LoginService{
@Autowired
	private UserRepository userRepository;

	@Override
	public Response<?> saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return new Response<>("data saved ", 800);
	}

	public Response<?> checkUser(User user) {
		// TODO Auto-generated method stub
		Optional<User> findByUserNameAndPassword = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(findByUserNameAndPassword.isPresent())
			return new Response<>("user exist ", 801);
		else {
			return new Response<>("user not exist ", 802);
		}
	}

	@Override
	public UserList getAllUsers() {
		// TODO Auto-generated method stub
		UserList userList=new UserList();
		 List<User> findAll = userRepository.findAll();
		 userList.setUser(findAll);
		return userList;
	}

	
	
}
