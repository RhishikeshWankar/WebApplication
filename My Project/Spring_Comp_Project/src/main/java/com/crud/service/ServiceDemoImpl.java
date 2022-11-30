package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.crud.maindao.MainDao;
import com.crud.model.AdminModel;
import com.crud.model.SaveModel;

@Service
public class ServiceDemoImpl implements ServiceDemo {

	@Autowired
	MainDao dao;
	
	@Transactional
	@Override
	public void save(SaveModel s1) {
		// TODO Auto-generated method stub
		dao.save(s1);
	}
	
	@Transactional
	@Override
	public String doLogin(SaveModel login) {
		// TODO Auto-generated method stub
		
		return dao.doLogin(login);
	}
	@Transactional
	@Override
	public void empsave(AdminModel adminmodel) {
		// TODO Auto-generated method stub
		dao.empsave(adminmodel);
		
	}

	@Transactional

	@Override
	public List<AdminModel> getdetails(String user) {
		// TODO Auto-generated method stub
		List<AdminModel> list=dao.getAllEmp(user);
		return list;
	}

	@Override
	public boolean updatedemo(int id) {
		
		
		return dao.updatedata(id);
		// TODO Auto-generated method stub
		
	}

}
