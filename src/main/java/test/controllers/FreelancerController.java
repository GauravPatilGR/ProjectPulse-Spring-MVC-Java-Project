package test.controllers;



import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import test.beans.Freelancer;

import test.beans.jobapplications;
import test.beans.postjob;
import test.beans.showjob;
import test.dao.CompanyDao;


@Controller
public class FreelancerController {
	
	@Autowired
	CompanyDao fd;
	
	
	@RequestMapping(value = "/freelancerdata",method = RequestMethod.POST)
	public String dataenterfreelancer(@ModelAttribute("c1") Freelancer c1,@RequestParam("fprofilephoto") MultipartFile filename,ModelMap mm) throws IOException
	{
		if(c1.getPassword().equals(c1.getCpassword()))
		{
		
        String f=filename.getOriginalFilename();
		
		String path="C:\\Users\\gaura\\eclipse-workspace\\SpringMVCPersonal_Project\\src\\main\\webapp\\files\\webimages";
		
		BufferedOutputStream bf= new BufferedOutputStream(new FileOutputStream(path+"/"+f));
		
		byte [] b=filename.getBytes();
		
		bf.write(b);
		bf.close();
		
		c1.setFpfile(f);
		
		
		
		fd.datasave(c1);
		
		mm.addAttribute("message","Register Successfully Done Login Now");
		
		return "loginf";
		}
		
		else {
			
			mm.addAttribute("messagee","Something Went Wrong Try Again!");
			return "registerf";
		}
	}
	
	
	@RequestMapping(value = "/Logincheakf",method = RequestMethod.POST)
	public String logincheakfreelancer(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap mm,HttpSession h1)
	{
		
		
	List<Freelancer> freelancerdetails	=fd.checkdata(email,password);
	
	if(freelancerdetails.isEmpty())
	{
		mm.addAttribute("loginerror","Something Went Wrong Try Again!");
		return "loginf";
	}
		
		
		
	else 
	{
	 
	  h1.setAttribute("emailf", email);
	  h1.setAttribute("data", freelancerdetails);
	  return "redirect:/homef";
	}
		
	}
	
	@RequestMapping("/homef")
	public String homepagef(HttpSession h1,ModelMap mm)
	{
	  String x=	(String) h1.getAttribute("emailf");
	                     
	  //User Data
	  List<Freelancer>  freelancerdata= (List<Freelancer>) h1.getAttribute("data");
	  
	  if(x==null)
	  {
		  return "loginf";
	  }
		
	    mm.addAttribute("kkk",freelancerdata);
	    
		return "homef";
	}
	
	@RequestMapping("/logoutf")
	public String logoutMapping(HttpSession h1)
	{
		
		h1.invalidate();
		
		return "loginf";
	}
	
	@RequestMapping("/profilef")
	public String profilefreelancer(HttpSession h1,ModelMap mm)	{
		
		//User Data
		  List<Freelancer>  freelancerdata= (List<Freelancer>) h1.getAttribute("data");
		  
		  mm.addAttribute("profile",freelancerdata);
		  
		
		return "profilef";
	}
	
	@RequestMapping(value = "/updateprofilef",method = RequestMethod.POST)
	public String updateprofile(@ModelAttribute("c1") Freelancer c1)
	{
		
		fd.updateprofile(c1);
		
		
		return "redirect:/logoutf";
	}
	
	@RequestMapping("/Explorejobs")
	public String Explorejobs(ModelMap mm) {
		
	List<showjob> jobdata=	fd.showalljobs();
	
	mm.addAttribute("jobdataofcompany",jobdata);
	
	
		
		return "Explorejobs";
	}
	
	@RequestMapping(value = "/viewandApply/{id}" ,method = RequestMethod.GET)
	public String showalljobinfo(@PathVariable int id,ModelMap mm,HttpSession h1)
	{
		
	List<postjob> viewalljobdata=	fd.showallinfo(id);
	
	mm.addAttribute("jobdata",viewalljobdata);
	
	
	//User Data
	  List<Freelancer>  freelancerdata= (List<Freelancer>) h1.getAttribute("data");
	  
	  mm.addAttribute("profile",freelancerdata);
		
		return "viewandApply";
		
	}
	
	@RequestMapping(value = "/applyforjob",method = RequestMethod.POST)
	public String applyforjon(@ModelAttribute("c1") jobapplications c1,@RequestParam("resume") MultipartFile filename,ModelMap mm) throws IOException
	{
		
		    String f=filename.getOriginalFilename();
			
			String path="C:\\Users\\gaura\\eclipse-workspace\\SpringMVCPersonal_Project\\src\\main\\webapp\\files\\webimages";
			
			BufferedOutputStream bf= new BufferedOutputStream(new FileOutputStream(path+"/"+f));
			
			byte [] b=filename.getBytes();
			
			bf.write(b);
			bf.close();
			
			c1.setCandidateresume(f);
		
		    fd.applyforjob(c1);
		    
		    mm.addAttribute("messagejob","Congratulations Application submitted successfully");
		
		    return "Explorejobs";
		
	}
	

	
	
	
	
	
	
	
	@RequestMapping("/loginf")
	public String freelancerloginpage()
	{
		
		return "loginf";
		
	}
	
	@RequestMapping("/registerf")
	public String freelancerregisterpage()
	{
		return "registerf";
	}

}
