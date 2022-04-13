package net.gokhanonal.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.transaction.annotation.Transactional;
import net.gokhanonal.spring.model.User;
import net.gokhanonal.spring.rowmapper.UserRowMapper;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public User getUser(int id) {
		User user  = (User)jdbcTemplate.queryForObject("select * from users where id = ?", new Object[] { id }, new UserRowMapper());
		return user;
	}
	
	@Transactional
	public List<User> getAllUsers() {
		List<User> user = (List<User>) jdbcTemplate.query("select * from users", new UserRowMapper());
		return user;
	}
	
	@Transactional
	public int addUser(User user) {
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("users").usingGeneratedKeyColumns("id");
		Map<String, Object> parameters = new HashMap<String, Object>(4);
		parameters.put("ad", user.getAd());
		parameters.put("soyad", user.getSoyad());
		parameters.put("kanGrubu", user.getKanGrubu());
		parameters.put("cepTel", user.getCepTel());
		parameters.put("adres", user.getAdres());
		Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
		return insertedId.intValue();
	}
	
	@Transactional
	public int updateUser(User user) {
		String sql = "update users set ad = ?, soyad = ?, kanGrubu = ?, cepTel = ?, adres = ? where id = ?";
		return jdbcTemplate.update(sql, new Object[] { user.getAd(), user.getSoyad(), user.getKanGrubu(), user.getCepTel(), user.getAdres(), user.getId() });
	}
	
	@Transactional
	public int deleteUser(int id) {
		return jdbcTemplate.update("delete from users where id = ?", id);
	}
	
	@Transactional
	public boolean isExist(int id) {
		try {
			User user  = getUser(id);
		    return user != null && user.getId() > 0;		
		}catch (Exception ignored){
			return false;
		}
	}
}