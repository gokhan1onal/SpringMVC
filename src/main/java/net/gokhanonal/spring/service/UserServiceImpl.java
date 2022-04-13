package net.gokhanonal.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import net.gokhanonal.spring.dao.UserDao;
import net.gokhanonal.spring.model.User;
import net.gokhanonal.spring.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}
	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}
	@Override
	public boolean isExist(int id) {
		return userDao.isExist(id);
	}
}