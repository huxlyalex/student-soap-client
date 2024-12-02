package com.example.studentclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.student.api.student.StudentDetailsRequest;
import com.example.student.api.student.StudentDetailsResponse;

@Component
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller marhaller;

	private WebServiceTemplate template;
	
	public StudentDetailsResponse getStudent (StudentDetailsRequest student)
	{
		template = new WebServiceTemplate(marhaller);
		StudentDetailsResponse response = (StudentDetailsResponse) template.marshalSendAndReceive("http://localhost:8081/ws",student);
		return response;
	}

}
