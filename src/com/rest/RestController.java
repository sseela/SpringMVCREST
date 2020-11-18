package com.rest;

import javax.servlet.annotation.HttpConstraint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public @ResponseBody String sample() {
		
		return "hello world";
	}
}
