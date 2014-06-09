package com.dental.spring.service;

import java.util.List;

import com.dental.spring.form.searchTable;

public interface SearchService
{
	public List<searchTable> get(String name);
	public List<searchTable> getAll();

}
