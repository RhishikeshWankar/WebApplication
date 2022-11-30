package com.crud.maindao;

import java.util.List;

import com.crud.model.AdminModel;
import com.crud.model.SaveModel;

public interface MainDao {

	void save(SaveModel s1);

	String doLogin(SaveModel login);

	void empsave(AdminModel adminmodel);

	List<AdminModel> getAllEmp(String user);

	boolean updatedata(int id);

	

}
