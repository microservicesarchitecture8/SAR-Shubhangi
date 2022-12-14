package com.sar.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.sar.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	// fake user list
	List<User> list = List.of(
			new User(1001, "Shubhangi", "9934788978"),
			new User(1002, "Devangi", "978656978"),
			new User(1003, "Ankita", "8890675123"),
			new User(1004, "Snehal", "9123897656"),
			new User(1005, "Apurva", "9888678655")
	);

	@Override
	public User getuser(int id) {
		return this.list.stream().filter(user -> user.getUserId()==id).findAny().orElse(null);
	}
}
