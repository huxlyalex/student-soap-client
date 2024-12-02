package com.example.studentclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class StudentConfig {
	
	@Bean
	public Jaxb2Marshaller marshel()
	{
		Jaxb2Marshaller marshel  = new Jaxb2Marshaller();
		marshel.setPackagesToScan("com.example.student.api.student");
		return marshel;
	}

}
