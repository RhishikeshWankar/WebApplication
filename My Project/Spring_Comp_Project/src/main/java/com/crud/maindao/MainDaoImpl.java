package com.crud.maindao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.model.AdminModel;
import com.crud.model.SaveModel;

@Repository
public class MainDaoImpl implements MainDao {

	@Autowired
	private EntityManager entitymanager;
	
	
	@Override
	public void save(SaveModel s1) {
		// TODO Auto-generated method stub
		Session session = entitymanager.unwrap(Session.class);
		session.save(s1);
	}

	@Override
	public String doLogin(SaveModel login) {
		// TODO Auto-generated method stub
		Session session= entitymanager.unwrap(Session.class);
		Query<SaveModel>query=session.createQuery("from SaveModel sm where sm.user='"+login.getUser()+"' and sm.password='"+login.getPassword()+"' and sm.roll='"+login.getRoll()+"'");
		List<SaveModel>list=query.getResultList();
		String rolltype="none";
		if(list.size()>0) {
			for(SaveModel s:list)
				rolltype = s.getRoll();
		}
		return rolltype;
	}

	@Override
	public void empsave(AdminModel adminmodel) {
		// TODO Auto-generated method stub
		Session session=entitymanager.unwrap(Session.class);
		session.save(adminmodel);
	}

	

	@Override
	public List<AdminModel> getAllEmp(String user) {
		// TODO Auto-generated method stub
		Session session = entitymanager.unwrap(Session.class ); 
		Query query=session.createQuery("From AdminModel am where am.assignedto='"+user+"'",AdminModel.class);
		List<AdminModel> list = query.getResultList();
		return list;
	}

	@Override
	public boolean updatedata(int id) {
		// TODO Auto-generated method stub
		
		Session session = entitymanager.unwrap(Session.class );
		AdminModel adminmodel = session.get(AdminModel.class, id);
		return false;
	}

	

}
