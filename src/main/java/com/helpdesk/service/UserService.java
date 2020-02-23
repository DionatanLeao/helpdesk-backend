package com.helpdesk.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.helpdesk.entity.User;

public interface UserService {
	
	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	Optional<User> findById(String id);
	
	void delete(String id);

	Page<User> findPage(Integer page, Integer linesPerPage, String orderBy, String direction);
}
