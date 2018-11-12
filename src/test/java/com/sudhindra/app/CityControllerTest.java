package com.sudhindra.app;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sudhindra.app.controller.CityController;
import com.sudhindra.app.model.City;
import com.sudhindra.app.service.CityServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CityController.class, secure = false)
public class CityControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
 
    @MockBean
    private CityServiceImpl cityServiceImpl;
    
    City mockCity = new City("Qandahar","AFG","Qandahar","{\"Population\": 237500}");
	
    @Test
	public void retrieveDetailsForCourse() throws Exception {
    	String expected = "{\"id\": 0,\"name\": \"Qandahar\",\"countryCode\": \"AFG\",\"district\": \"Qandahar\",\"info\": \"{\\\"Population\\\": 237500}\"}";
    	
    	Mockito.when(cityServiceImpl.getCity(2l)).thenReturn(mockCity);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/city/listcity/2");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected, mvcResult.getResponse().getContentAsString(), false);
	}
    
}
