package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmpId(1003);
		emp.setEmpName("Derrick");
		
		System.out.println("Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
	}
}
