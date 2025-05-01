package com.sode.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
import org.springframework.stereotype.Service;

import com.sode.course.entities.User;
import com.sode.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();
	}
	
	public User findById(Long id) {
		
		return repository.findById(id).get();
		
	}

	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User usr) {
		User entityUser = repository.getReferenceById(id);
		updateData(entityUser, usr);
		return repository.save(entityUser);
		
		
	}

	private void updateData(User entityUser, User usr) {
		entityUser.setName(usr.getName());
		entityUser.setEmail(usr.getEmail());
		entityUser.setPhone(usr.getPhone());
	}
}
