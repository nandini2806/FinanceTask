package com.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.User;
import com.finance.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public User createUser( User user) {
		return repo.save(user);
	}
	
	public List<User> getUsers(){
		return repo.findAll();
	}
	
	public User getUserById(Long id) {
		return repo.findById(id)
				.orElseThrow(()->new RuntimeException("User not found"));
	}
	
	public User updateUser(Long id,User user) {
		User existing=repo.findById(id)
				.orElseThrow(()->new RuntimeException("User not found"));
		existing.setName(user.getName());
		existing.setRole(user.getRole());
		existing.setActive(user.isActive());
		return repo.save(existing);
		
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}
}
