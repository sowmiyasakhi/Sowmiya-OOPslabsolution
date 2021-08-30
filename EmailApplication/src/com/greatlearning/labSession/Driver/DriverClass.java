package com.greatlearning.labSession.Driver;

import java.util.Scanner;

import com.greatlearning.labSession.Services.CredentialService;
import com.greatlearning.labSession.model.Department;
import com.greatlearning.labSession.model.Employee;


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Bindu","Tandon");
		System.out.println("Enter your department ");
		System.out.println("1. Technical\n2. Admin\n3. HR\n4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Department dept = new Department();
		CredentialService cred = new CredentialService();
		switch(choice) {
		case 1:
			dept.setDeptName("tech");
			String email = cred.generateEmail(e1, dept);
			String password = cred.generatePassword();
			cred.showCredentials(email, password, e1.getFirstname());
		break;
		case 2:
			dept.setDeptName("admin");
			String email1 = cred.generateEmail(e1, dept);
			String password1 = cred.generatePassword();
			cred.showCredentials(email1, password1, e1.getFirstname());
		break;
		case 3:
			dept.setDeptName("hr");
			String email2 = cred.generateEmail(e1, dept);
			String password2 = cred.generatePassword();
			cred.showCredentials(email2, password2, e1.getFirstname());
		break;
		case 4:
			dept.setDeptName("legal");
			String email3 = cred.generateEmail(e1, dept);
			String password3 = cred.generatePassword();
			cred.showCredentials(email3, password3, e1.getFirstname());
		break;
		default:
			System.out.println("Please give a valid department no.");
		}
		sc.close();
	}
	
}
