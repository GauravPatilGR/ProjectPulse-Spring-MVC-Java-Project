package test.dao;

import java.security.spec.MGF1ParameterSpec;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.Company;
import test.beans.Freelancer;
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

	//Post Project
	public void postprojectdetails(postproject c2) {

		t1.update("insert into postproject (projectd,projectf,projectb,projectt,projects,projectc,projecte) values ('"+c2.getProjectd()+"','"+c2.getProjectf()+"','"+c2.getProjectb()+"','"+c2.getProjectt()+"','"+c2.getProjects()+"','"+c2.getProjectc()+"','"+c2.getProjecte()+"')");
		
	}
	
    public void datasave(Freelancer c1) {
		
		t1.update("insert into freelancer (fname,femail,fphone,fdate,fpfile,flinkedin,feducation,fcharge,gender,skills,password,cpassword) values('"+c1.getFname()+"','"+c1.getFemail()+"','"+c1.getFphone()+"','"+c1.getFdate()+"','"+c1.getFpfile()+"','"+c1.getFlinkedin()+"','"+c1.getFeducation()+"','"+c1.getFcharge()+"','"+c1.getGender()+"', '"+c1.getSkills()+"' , '"+c1.getPassword()+"','"+c1.getCpassword()+"')");
	  
		
	}

	public List<Freelancer> checkdata(String email, String password) {
		
		return t1.query("select *from freelancer where femail='"+email+"' and password= '"+password+"'", new RowMapper<Freelancer>() {

			@Override
			public Freelancer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				Freelancer f1= new Freelancer();
				f1.setId(rs.getInt(1));
				f1.setFname(rs.getString(2));
				f1.setFemail(rs.getString(3));
				f1.setFphone(rs.getString(4));
				f1.setFdate(rs.getDate(5));
				f1.setFlinkedin(rs.getString(6));
				f1.setFeducation(rs.getString(7));
				f1.setFpfile(rs.getString(8));
				f1.setFcharge(rs.getString(9));
				f1.setGender(rs.getString(10));
				f1.setSkills(rs.getString(11));
				f1.setPassword(rs.getString(12));
				f1.setCpassword(rs.getString(13));
				
				return f1;
			}
			
			
			
		});
		
	}

	public void updateprofile(Freelancer c1) {
		
		t1.update("update freelancer set  fname='"+c1.getFname()+"',femail='"+c1.getFemail()+"',fphone='"+c1.getFphone()+"',flinkedin='"+c1.getFlinkedin()+"',feducation='"+c1.getFeducation()+"',fcharge='"+c1.getFcharge()+"',skills='"+c1.getSkills()+"' where id='"+c1.getId()+"'");
		
	}


}
