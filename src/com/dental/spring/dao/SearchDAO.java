package com.dental.spring.dao;

import java.util.List;

import com.dental.spring.form.searchTable;

public interface SearchDAO 
{
	public List<searchTable> get(String name);
	public List<searchTable> getAll();

}
