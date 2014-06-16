package com.dental.spring.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HttpServletBean;

import com.dental.spring.dao.SearchDAO;
import com.dental.spring.form.searchTable;
import com.dental.spring.service.SearchService;

@Controller

public class Index 
{
	@Autowired
	public SearchService searchService;
	
	@Autowired
	 private ResourceLoader resourceLoader;
	
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
	
	@RequestMapping(value="/uploadFile")
	public String uploadFile(Model model)
	{
		
		return "UploadFile";
	}
	
	@RequestMapping(value="/upload")
	public String upload(Model model,HttpServletRequest request, @RequestParam("file") MultipartFile file)
	{
		try
		{
			System.out.println("--------Saving File--------");
			String saveDirectory=request.getSession().getServletContext().getRealPath("/")+"resources\\";
		    file.transferTo(new File(saveDirectory +file.getOriginalFilename()));
		    System.out.println("--------Save Complete-----");
			
		}
		catch (Exception e) 
		{
			System.out.println("error:"+e.getMessage());
		}
		 
		return "UploadFile";
	}
	
	@RequestMapping(value="/upload1")
	public String upload1(Model model,HttpServletRequest request, @RequestParam("file") MultipartFile file)
	{
		try
		{
			System.out.println("--------New Saving File--------");
			
			file.transferTo(resourceLoader.getResource("resources/"+file.getOriginalFilename()).getFile());
		    System.out.println("--------New Save Complete-----");
			
		}
		catch (Exception e) 
		{
			System.out.println("error:"+e.getMessage());
		}
		 
		return "UploadFile";
	}

	
	
	
}
