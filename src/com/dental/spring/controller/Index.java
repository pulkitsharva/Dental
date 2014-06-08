package com.dental.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index 
{
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		System.out.println("Coming to controller");
		model.addAttribute("springVar", "Pulkit");
		return "Index";
	}
}
