package com.test.EmpRESTBootApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.EmpRESTBootApp.entities.Emp;

public interface EmpDao extends  CrudRepository<Emp, Integer>{

}
