package com.accolite.au;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC) 
public interface EmployeeInterface {
	Employee getEmployee(int id);
	boolean createEmployee(int id,String name);
	boolean deleteEmployee(int id);
	boolean updateEmployee(int id,String name);
	Employee[] getAllEmployees();
}
