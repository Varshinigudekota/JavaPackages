package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class SchoolApp {
public static void main(String[] args) {

	School school = new School();
	school.setName("RYMEC");
	school.setLocation("BLY");

	Principal principal = new Principal();
	principal.setprincipalName("Sindhu");
	principal.setexperienceYears(10);

	school.showSchoolInfo();
	System.out.println();
	principal.showPrincipalInfo();
}
}