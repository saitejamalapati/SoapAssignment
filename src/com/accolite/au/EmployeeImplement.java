package com.accolite.au;

import java.util.HashMap;
import java.util.Set;

import javax.jws.WebService;

@WebService(endpointInterface="com.accolite.au.EmployeeInterface")
public class EmployeeImplement implements EmployeeInterface{
	private static HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
	
	@Override
	public boolean deleteEmployee(int id) {
		if(hm.get(id) == null)
			return false;
		hm.remove(id);
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		return hm.get(id);
	}

	@Override
	public Employee[] getAllEmployees() {
		Set<Integer> idset = hm.keySet();
		Employee[] p = new Employee[idset.size()];
		int i=0;
		for(Integer id : idset){
			p[i] = hm.get(id);
			i++;
		}
		return p;
	}

	@Override
	public boolean createEmployee(int id,String name) {
		Employee p=new Employee();
		p.setId(id);
		p.setName(name);
		hm.put(id, p);
		return true;
	}

	@Override
	public boolean updateEmployee(int id,String name) {
		Employee p=hm.get(id);
		p.setName(name);
		
		return false;
	}
}
