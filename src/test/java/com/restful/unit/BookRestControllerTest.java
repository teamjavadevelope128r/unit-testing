package com.restful.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restful.model.Book;
import com.restful.service.BookService;

public class BookRestControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private BookService bookservice;
	
	@Test
	public void test_addBook()throws Exception{
		Book b=new Book(101,"505");
		when(bookservice.saveBook(b)).thenReturn(true);
		ObjectMapper mapper=new ObjectMapper();
		String bookjson=mapper.writeValueAsString(b);
		MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.post("/addbook").contentType("application/json").content(bookjson);
		
		MvcResult mvcResult=mockMvc.perform(reqBuilder).andReturn();
		int status=mvcResult.getResponse().getStatus();
		assertEquals(201,status);
	}
}
 