package com.school.staff;
public class Principal
{
	private String principalName;
	private int experienceYears;
	
	public void setprincipalName(String principalName)
	{
		this.principalName=principalName;
	}
	public void setexperienceYears(int experienceYears)
	{
		this.experienceYears=experienceYears;
	}
	public String getprincipalName()
	{
		return principalName;
	}
	public int getexperienceYears()
	{
		return experienceYears;
	
	}
	public void showPrincipalInfo()
	{
		System.out.println("Principal Name:" + principalName);
		System.out.println("Experience Years:" + experienceYears);
	}
}
	