package net.gokhanonal.spring.service;

import java.util.List;
import net.gokhanonal.spring.model.User;

public interface UserService {
	public User getUser(int id);
	public List<User> getAllUsers();
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
	public boolean isExist(int id);
}
