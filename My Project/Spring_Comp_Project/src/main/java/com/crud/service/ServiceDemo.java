package com.crud.service;

import java.util.List;

import com.crud.model.AdminModel;
import com.crud.model.SaveModel;

public interface ServiceDemo {

	void save(SaveModel s1);

	String doLogin(SaveModel login);

	void empsave(AdminModel adminmodel);

	List<AdminModel> getdetails(String user);

	boolean updatedemo(int id);

	

}
