package com.javacodegeeks.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class ApplicationController {
 
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String welcome(ModelMap model) { 

		return "Hello World - Standard";
 
	}
 
}
