package com.test.EmpRESTBootApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.EmpRESTBootApp.dao.EmpDao;
import com.test.EmpRESTBootApp.entities.Emp;

@Service
public class EmpService {

	@Autowired
	EmpDao empdao;
	
	public  Iterable<Emp> getAllEmps()
	{
		return empdao.findAll();
	}

	public Emp getEmpById(Integer eid) {
		
		return empdao.findOne(eid);
	}

	public Emp createEmp(Emp e) {
		// TODO Auto-generated method stub
		return empdao.save(e);
	}

	public void deleteEmp(Integer eid) {
	      empdao.delete(eid);
	}

	public Emp updateEmp(Integer eid, String ename, Double salary) {
		Emp e=empdao.findOne(eid);
		e.setEname(ename);e.setSalary(salary);
		return empdao.save(e);
	}
}
