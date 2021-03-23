package com.restful.service;

import org.springframework.stereotype.Service;

import com.restful.model.Book;

@Service
public class BookService {

	public boolean saveBook(Book book) {
		if(book.getBookId()==null) {
			return false;
		}
		return true;
	}
}
