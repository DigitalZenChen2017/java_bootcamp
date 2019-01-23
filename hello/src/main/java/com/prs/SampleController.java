package com.prs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // monitors incoming requests and send responses back to web browser
@EnableAutoConfiguration
public class SampleController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SampleController.class, args);
	}
	
	@RequestMapping("/hello") // points external web request to this method
	@ResponseBody // puts response and returns it to web application
	String home() {
		return "Hello Java Bootcamp!!!!";
	}
	
	@RequestMapping("/registernow") // points external web request to this method
	@ResponseBody // puts response and returns it to web application
	String registerNow() {
		return "Register Now!";
	}

}
