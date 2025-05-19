package com.company.admin;

public class Department {
	private String deptName;
	private int deptId;

	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}
	public void setDeptId(int deptId) 
	{
		this.deptId = deptId;
	}
	public String getDeptName() 
	{
		return deptName;
	}
	public int getDeptId() 
	{
		return deptId;
	}

	public void showDepartmentDetails() 
	{
		System.out.println("Department Name: " + deptName);
		System.out.println("Department Id: " + deptId);
	}

}