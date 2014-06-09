package com.dental.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dental.spring.dao.SearchDAO;
import com.dental.spring.form.searchTable;
import com.dental.spring.service.SearchService;

@Controller
public class Index 
{
	@Autowired
	public SearchService searchService;
	
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		
		System.out.println("Coming to controller");
		model.addAttribute("springVar", "Pulkit");
		model.addAttribute("newList",searchService.getAll());
		return "Index";
	}
	
	@RequestMapping(value="/suggestion")
	public @ResponseBody List<searchTable> suggestion(@RequestParam("value") String value,Model model)
	{
		return searchService.get(value);
		
	}
	
	@RequestMapping(value="/load")
	public @ResponseBody List<searchTable> load(Model model)
	{
		System.out.println("List:"+searchService.getAll().size());
		
		return searchService.getAll();
		
	}
}
