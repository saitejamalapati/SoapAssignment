package com.accolite.au;

import javax.xml.ws.Endpoint;

public class EmployeePublisher {
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:9999/ws/employee", new EmployeeImplement());  
	}
}