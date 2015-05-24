package com.xinglongjian.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String index(Map<String, Object> model)
	{
		return "index";
	}
	
	@RequestMapping("/")
	public String main(Map<String, Object> model)
	{
		return "main";
	}
	
	@RequestMapping("/tologin")
	public String login(Map<String, Object> model)
	{
		return "login";
	}
}
