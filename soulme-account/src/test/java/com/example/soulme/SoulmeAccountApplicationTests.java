package com.example.soulme;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoulmeAccountApplicationTests {
	
	
	  @Autowired ServerProperties serverProperties;
	 
	  /* 
	 * @Autowired private RestTemplate restTemplate;
	 */
	@Test
	void contextLoads() {
		
	}
	
	/*
	 * @Test void testURI() { System.out.println( "Server properties: ");
	 * System.out.println( serverProperties.getAddress()+
	 * ":"+serverProperties.getPort());
	 * 
	 * assertTrue( serverProperties.getPort() == null, " No port"); }
	 */
}
