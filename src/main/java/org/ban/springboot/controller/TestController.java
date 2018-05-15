package org.ban.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	 @GetMapping("/helloworld")
	    public String helloworld() {
	        return "helloworld";
	    }

	 @Autowired
	    private BookBean bookBean;
	 
	 @RequestMapping("/book")
	    public String book() {
	        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
	    }
	 
}
