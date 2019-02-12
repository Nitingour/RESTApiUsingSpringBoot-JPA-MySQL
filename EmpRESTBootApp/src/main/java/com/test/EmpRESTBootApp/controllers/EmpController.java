package com.test.EmpRESTBootApp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.EmpRESTBootApp.entities.Emp;
import com.test.EmpRESTBootApp.services.EmpService;
@RestController
@RequestMapping("/api")
public class EmpController {
	@Autowired
	private EmpService empservice;

	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to Spring Boot";
	}
   @GetMapping("/allemps")
  public Iterable<Emp> getAllEmp()
  {
	  return empservice.getAllEmps();
  }
  @GetMapping("/getEmp/{eid}")
  public Emp getEmpByID(@PathVariable Integer eid)
  {
	  return empservice.getEmpById(eid);
  }

   @PostMapping("/create")
   public Emp getEmpByID(@RequestBody Emp e)
   {
 	  return empservice.createEmp(e);
   }
   
   @DeleteMapping("/delEmp/{eid}")
   public void delEmpByID(@PathVariable Integer eid)
   {
 	   empservice.deleteEmp(eid);
   }
  
   @PutMapping("/updateEmp/{eid}/{ename}/{salary}")
   public Emp updateEmpByID(@PathVariable Integer eid,@PathVariable String ename,@PathVariable Double salary)
   {
 	   return empservice.updateEmp(eid,ename,salary);
   }
}


/*  From another spring boot project we can access this api 
 @RestController
public class ClientController {
	
@RequestMapping("/get")
public String hello()
{
    RestTemplate rt=new RestTemplate();
	Emp e=rt.getForObject("http://localhost:9091/api/getEmp/103", Emp.class);
	
	return e.getEid()+"  "+e.getEname()+" "+e.getSalary();	
}
}
  
 */