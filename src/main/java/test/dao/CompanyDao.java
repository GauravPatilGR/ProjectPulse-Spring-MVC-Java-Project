package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.Company;
import test.beans.postjob;
import test.beans.postproject;

public class CompanyDao {
	
	JdbcTemplate t1;

	

	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}

	//Register Company
	public void dataenter(Company c1) {
	
		t1.update("insert into company (name,email,number,website,password,confirmpassword,profileimg) values ('"+c1.getName()+"','"+c1.getEmail()+"','"+c1.getNumber()+"','"+c1.getWebsite()+"','"+c1.getPassword()+"','"+c1.getConfirmpassword()+"','"+c1.getProfileimg()+"') ");
		
	}

	//Retrive profile data
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
				c1.setAbout(rs.getString(9));
				
				return c1;
			}
			
			
			
			
		});
	}

	//Update Profile
	public void updatedata(Company c2) {
		
		t1.update("update company set name='"+c2.getName()+"',email='"+c2.getEmail()+"',number='"+c2.getNumber()+"',website='"+c2.getWebsite()+"',about='"+c2.getAbout()+"' where id='"+c2.getId()+"'");
		
	}

	//Post job
	public void postjobdetails(postjob c1) {
		
		t1.update("insert into postjob (jobd,jtittle,jskills,jtype,jsalary,jcname,jcemail) values ('"+c1.getJobd()+"','"+c1.getJtittle()+"','"+c1.getJskills()+"','"+c1.getJtype()+"','"+c1.getJsalary()+"','"+c1.getJcname()+"','"+c1.getJcemail()+"')");
		
	}

	public void postprojectdetails(postproject c2) {

		t1.update("insert into postproject (projectd,projectf,projectb,projectt,projects,projectc,projecte) values ('"+c2.getProjectd()+"','"+c2.getProjectf()+"','"+c2.getProjectb()+"','"+c2.getProjectt()+"','"+c2.getProjects()+"','"+c2.getProjectc()+"','"+c2.getProjecte()+"')");
		
	}


}
