package com.ashokit.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class WelcomeRestController {

	@GetMapping("/come")
	public String welcomeMsg() {
		String msgtxt="Welcome to RestController";
		return msgtxt;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Morning";
	}
	@GetMapping("/date")
	public ResponseEntity<String> dateMsg(){
	 String msg="This is ResponseEntity concept :" +new Date();
	return new ResponseEntity<>(msg,HttpStatus.OK);
}}
