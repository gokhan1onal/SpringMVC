package net.gokhanonal.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import net.gokhanonal.spring.model.User;

public class UserRowMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int row) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setAd(rs.getString("ad"));
		user.setSoyad(rs.getString("soyad"));
		user.setKanGrubu(rs.getString("kanGrubu"));
		user.setCepTel(rs.getString("cepTel"));
		user.setAdres(rs.getString("adres"));
		return user;
	}
}
