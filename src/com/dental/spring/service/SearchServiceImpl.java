package com.dental.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dental.spring.dao.SearchDAO;
import com.dental.spring.form.searchTable;

@Service
public class SearchServiceImpl implements SearchService 
{
	@Autowired
	public SearchDAO searchDAO;
	
	@Override
	@Transactional
	public List<searchTable> get(String name) 
	{
	
		return searchDAO.get(name);
	}
	
	@Override
	@Transactional
	public List<searchTable> getAll() 
	{
	
		return searchDAO.getAll();
	}
}
