package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.Company;

public class CompanyDao {
	
	JdbcTemplate t1;

	

	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}

	public void dataenter(Company c1) {
	
		t1.update("insert into company (name,email,number,website,password,confirmpassword,profileimg) values ('"+c1.getName()+"','"+c1.getEmail()+"','"+c1.getNumber()+"','"+c1.getWebsite()+"','"+c1.getPassword()+"','"+c1.getConfirmpassword()+"','"+c1.getProfileimg()+"') ");
		
	}

	public List<Company> loginauthecation(String email, String password) {
		
		return t1.query("select *from company where email='"+email+"' and password='"+password+"' " , new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Company c1= new Company();
				c1.setId(rs.getInt(1));
				c1.setName(rs.getString(2));
				c1.setEmail(rs.getString(3));
				c1.setNumber(rs.getString(4));
				c1.setWebsite(rs.getString(5));
				c1.setPassword(rs.getString(6));
				c1.setConfirmpassword(rs.getString(7));
				c1.setProfileimg(rs.getString(8));
				
				return c1;
			}
			
			
			
			
		});
	}


}
