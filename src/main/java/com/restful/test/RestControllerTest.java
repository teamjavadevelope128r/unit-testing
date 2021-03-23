package com.restful.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

	@GetMapping("/welcome")
	public ResponseEntity<String>WelcomeMsg(){
		String msg="welcome to rest unit test";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
