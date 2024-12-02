package com.example.studentclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.api.student.StudentDetailsRequest;
import com.example.student.api.student.StudentDetailsResponse;
import com.example.studentclient.client.SoapClient;

@RestController
public class StudentController {
	
	@Autowired
	SoapClient soapclient;
	
	@PostMapping("/bank")
	public StudentDetailsResponse getBank(@RequestBody StudentDetailsRequest request)
	{
		System.out.println(request);
		return soapclient.getStudent(request);
	}

}
