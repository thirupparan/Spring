package com.sgic.myleave.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sgic.myleave.entity.User;

@Service
public class userServiceImpl implements UserService {

	List<User> users = new ArrayList<>();


	@Override
	public List<User> createUsers(User user) {
		
		users.add(user);
		return users;
	}

	@Override
	public List<User> getUser() {
		return users;
	}

	@Override
	public boolean updateUser(User user) {
		for (User user2 : users) {
			if (user2.getId() == user.getId()) {
				user2.setUserName(user.getUserName());
			}
			break;
		}
		return true;
	}

	@Override
	public boolean deleteUser(int id) {

		for (User user : users) {
			if (user.getId() == id) {
				users.remove(user);
				break;
			}
		}
		return true;
	}

}
