
package myLibary;
import admin.Admin;
import java.util.Scanner;

public class WelcomePage {
	
	Scanner sc= new Scanner(System.in);
	Admin adObj= new Admin();
	
	public void display() 
	{
		System.out.println("****Library Management Application****");
		System.out.println("1.Login");
		System.out.println("2.Sign up");
		System.out.println("3.Exit");
		System.out.println("Enter any option:");
		
		int a=sc.nextInt();
	

			
		
		switch(a) 
		{
		case 1:adObj.login();
			   display();
			break;
		
		case 2:
			display();
			break;
	
		case 3: 
			
			
		break;
	
		}
		
		
		
		
		
		
	}

}
