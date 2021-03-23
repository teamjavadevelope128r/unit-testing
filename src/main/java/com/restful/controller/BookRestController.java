package com.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.model.Book;
import com.restful.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookservice;
	
	@PostMapping(value="/addbook",consumes={"application/json"})
	public ResponseEntity<String>addBook(@RequestBody Book book){
		String msg=null;
		
		boolean isSaved=bookservice.saveBook(book);
		if(isSaved) {
			msg="book saved";
			return new ResponseEntity<>(msg,HttpStatus.CREATED);
		}else {
			msg="failded to save";
		      return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
