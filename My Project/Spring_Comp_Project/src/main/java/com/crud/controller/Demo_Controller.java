package com.crud.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.crud.model.AdminModel;
import com.crud.model.SaveModel;
import com.crud.service.ServiceDemo;

@RestController
@CrossOrigin

public class Demo_Controller {
@Autowired
ServiceDemo servicedemo;

@PostMapping("/save")
public void save(@RequestBody SaveModel s1) 
{
	servicedemo.save(s1);
}

@PostMapping("/login")
public String getLogin(@RequestBody SaveModel login) {
	return servicedemo.doLogin(login);
}

@PostMapping("/empsave")
public void empsave(@RequestBody AdminModel adminmodel) {
	servicedemo.empsave(adminmodel);
}

@GetMapping("/getdetails")
public List<AdminModel> getEmp(@RequestParam String user){
	return servicedemo.getdetails(user);
}

@GetMapping("/status/{id}")
public boolean updatedata(@PathVariable int id)
{
	return servicedemo.updatedemo(id);
	
}
}
