package com.restful.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.RestController;

@WebMvcTest(value=RestController.class)
public class UnitRestTesting {
	
	  @Autowired
	  private MockMvc mockMvc;
	  
      public void test_WelcomeMsg()throws Exception{
	  
	  MockHttpServletRequestBuilder requBuilder=MockMvcRequestBuilders.get("/welcome");
	  MvcResult mvcResult=mockMvc.perform(requBuilder).andReturn();
	  int status=mvcResult.getResponse().getStatus();
	  assertEquals(201,status);	  
	  System.out.println("compleate");
	  System.out.println("junit testiong");
	  System.out.println("junit mackito");
   }

}
