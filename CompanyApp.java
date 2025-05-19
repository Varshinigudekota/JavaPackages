package com.company.app;

import com.company.hr.Employee;

import com.company.admin.Department;
public class CompanyApp  
{
public static void main(String[] args) 
{
	Employee employee = new Employee();
	employee.setId(511568);
	employee.setName("Varshini");
	employee.setSalary(4700.00);

	Department department= new Department(); 
	department.setDeptName("developer");
	department.setDeptId(1245);

	employee.showEmployeeDetails();
	System.out.println();
	department.showDepartmentDetails();
}
}

