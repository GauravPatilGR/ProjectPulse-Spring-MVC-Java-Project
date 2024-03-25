package test.controllers;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import test.beans.Company;
import test.beans.postjob;
import test.beans.postproject;
import test.dao.CompanyDao;

@Controller
public class CompanyController {
	
	
	@Autowired
	CompanyDao cd;
	
	//Mapping for Register
	@RequestMapping(value = "/regdata",method = RequestMethod.POST)
	public String registerdata(@ModelAttribute ("c1") Company c1,@RequestParam("filename") MultipartFile filename) throws IOException 
	{
		
		if(c1.getPassword().equals(c1.getConfirmpassword()))
		{
		
		String f=filename.getOriginalFilename();
		
		String path="C:\\Users\\gaura\\eclipse-workspace\\SpringMVCPersonal_Project\\src\\main\\webapp\\files\\webimages";
		
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(path+"/"+f));
		
		byte b []=filename.getBytes();
		
		bf.write(b);
		
		bf.close();
		
		
		c1.setProfileimg(f);
		
		
		
		
		cd.dataenter(c1);
		
		
		return "redirect:/loginc";
		}
		
		return "redirect:/registercompany";
		
	}
	
	
	
	//Mapping for Login
	@RequestMapping(value = "/logindata",method = RequestMethod.POST)
	public String loginmapping(@RequestParam("email")String email,@RequestParam("password") String password,HttpSession h1)
	{
		
		
	List<Company> Company = cd.loginauthecation(email,password);

	
	
	
	if(Company.isEmpty())
	{
		return "redirect:/loginc";
		
	}
	
	h1.setAttribute("email", email);
	h1.setAttribute("company", Company);
	
     return "redirect:/homec";	
	}
	
	
	
	//Mapping for Homepage
	@RequestMapping("/homec")
	public String home(HttpSession h1,ModelMap mm)
	{
	String data=(String) h1.getAttribute("email");
	
	//List having all data of Company
	List<Company> companies = (List<Company>)h1.getAttribute("company");
    
	
	if(data==null)
	{
		return "redirect:/loginc";
	}
		
		
		
		mm.addAttribute("kk",companies);
		return "homec";
	}
	
	
	
	//Profile Of Comapany
	@RequestMapping("/profilec")
	public String profilcompany(HttpSession h1,ModelMap mm)
	{
		
		//Reuse the Method List having all data of Company
		List<Company> companies = (List<Company>)h1.getAttribute("company");
		
		mm.addAttribute("kk",companies);
		
		return "profilec";
	}
	
	
	
	//Update profile Mapping
	@RequestMapping(value = "/updateinfoc",method = RequestMethod.POST)
	public String updateprofile(@ModelAttribute ("c2") Company c2) 
	{
		cd.updatedata(c2);
		
		return "redirect:/loginc";
	}
	
	
	//Post Job data Mapping
	@RequestMapping(value = "/postjobdata",method = RequestMethod.POST)
	public String postjob(@ModelAttribute("c1") postjob c1)
	{
		
		cd.postjobdetails(c1);
		
		return "redirect:/homec";
		
	}
	
	@RequestMapping(value = "/postprojectdata",method = RequestMethod.POST)
	public String postproject(@ModelAttribute ("c2") postproject c2,@RequestParam("projectfile") MultipartFile filename) throws IOException
	{
		String f=filename.getOriginalFilename();
		
		String path="C:\\Users\\gaura\\eclipse-workspace\\SpringMVCPersonal_Project\\src\\main\\webapp\\files\\webimages";
		
		BufferedOutputStream bf= new BufferedOutputStream(new FileOutputStream(path+"/"+f));
		
		byte [] b=filename.getBytes();
		
		bf.write(b);
		bf.close();
		
		c2.setProjectf(f);
		
		cd.postprojectdetails(c2);
		
		return "redirect:/homec";
	}

	
	
	
	//Post job webpage
	@RequestMapping("/postjob")
	public String postjobpage(HttpSession h1,ModelMap m)
	{
		
		//Reuse the Method List having all data of Company
				List<Company> companies = (List<Company>)h1.getAttribute("company");
				m.addAttribute("kk",companies);
		
		return "postjob";
	}
	
	@RequestMapping("/postproject")
	public String postprojectpage(HttpSession h1,ModelMap m)
	{
		
		//Reuse the Method List having all data of Company
		List<Company> companies = (List<Company>)h1.getAttribute("company");
		m.addAttribute("kk",companies);
		
		
		
		return "postproject";
	}
	
	
	
	
	
	//Mappig for Logout
	@RequestMapping("/logutc")
	public String logout(HttpSession h1)
	{
		h1.invalidate();
		
		return "redirect:/loginc";
	}
	
	
	
	
	//Mapping for Footer
	@RequestMapping("/footer")
	public String footerpage()
	{
		
		return "footerfile";
	}
	
	//Mapping for Header
	@RequestMapping("/header")
	public String headerfile()
	{
		
		return "headerfile";
	}
	
	
	//Mapping for Login page
	@RequestMapping("/loginc")
	public String loginpage()
	{
		
		
		return "loginc";
	}
	
	
	//Mapping for Register Page
	@RequestMapping("/registercompany")
	public String registercompany()
	{
		
		
		return "registerc";
	}
	
	

}
