package com.sudhindra.app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sudhindra.app.controller.CityController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//public class ApplicationTests extends AbstractTest{
public class ApplicationTests {
	@MockBean
	CityController cityController;

	MockMvc mvc;
	@Autowired
	WebApplicationContext webApplicationContext;
	
	@Test
	public void getUptime() throws Exception {
		   String uri = "/uptime";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   assertEquals(200, status);
		   String content = mvcResult.getResponse().getContentAsString();
		   System.out.println(content);
		   
//		   Product[] productlist = super.mapFromJson(content, Product[].class);
//		   assertTrue(productlist.length > 0);
		}
	
}
