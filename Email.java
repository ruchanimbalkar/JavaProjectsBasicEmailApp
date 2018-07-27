package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	private Scanner in;
	
	//Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName){
		
		this.firstName = firstName;
		this.lastName=lastName;
		System.out.println("Email created for "+ this.firstName + " "+ this.lastName );
		//Ask for Department
		this.department=setDepartment();
		System.out.println("Department : " + department);
	}
	
	//Ask for Department
	private String setDepartment(){
		System.out.println("Department Codes\n 1 for Sales \n 2 for Development" + 
		" \n 3 for Accounting \n 4 for None");
		in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		switch(deptChoice){
			
			case 1:
					return "sales";
					
			case 2:
					return "dev";
			
			case 3:
					return "acct";
							
			default:
					return "";
		
		}
				
	}
	
}

