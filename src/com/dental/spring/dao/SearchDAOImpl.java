package com.dental.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dental.spring.form.searchTable;

@Repository
public class SearchDAOImpl implements SearchDAO 
{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<searchTable> get(String name)
	{
		Query qry = sessionFactory.getCurrentSession().createQuery("From searchTable where name like :name");
		qry.setParameter("name",'%'+name+'%');
		return qry.list();
		
	}
	
	@Override
	public List<searchTable> getAll()
	{
		Query qry = sessionFactory.getCurrentSession().createQuery("From searchTable");
		return qry.list();
		
	}

}
