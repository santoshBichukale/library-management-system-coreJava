package admin;
import studentsInformation.Students;
import java.util.Scanner;
import booksInformation.Books;

public class Admin  {
	
	String adminId="12345";
	String adminPass="Santosh@123";

	Scanner sc= new Scanner(System.in);
	Students stobj= new Students();
	Books bobj = new Books();
	

	public void login()
	
	{
		System.out.println("login Page");
		
		
		System.out.println("Enter Id - ");
		String a= sc.nextLine();
		
		System.out.println("Enter Password - ");
		String b= sc.nextLine();
		
		
		if(adminId.equals(a) && adminPass.equals(b))
		{
			System.out.println();
			
			System.out.println("Login Successful: welcome Admin");
			System.out.println();
			adminPage();			
			
			
		}
		else 
		{
			System.out.println("You have entered incorrect id or password Login Unsucssesful");
			
			
			
			
			
		}

		


	}
	
	public void adminPage()
	{
		System.out.println();
		System.out.println("****Admin Page****");
		System.out.println();
		
		System.out.println("1.Student Records");
		System.out.println("2.Book records");
		System.out.println("3.Mange Books");
		System.out.println("4.Exit");
		System.out.println("Enter any option:");
		System.out.println();
		
		 int c=sc.nextInt();
		 m(c);
	
	}
		 
	
	public void m(int x) {
		int c=x;
		 
		switch(c) 
		{
		case 1:System.out.println();
		       System.out.println("**Student Page**");
		       System.out.println();
		       System.out.println("1.Add Students");
		       System.out.println("2.Display all Student");
		       System.out.println("3.Exit");
		       System.out.println("Enter any option:");
				int d=sc.nextInt();
				
		       			switch(d) {
		    			       case 1: stobj.studentAdd(); 
		    			       adminPage();
		    			           break;
		    			           
		    			       case 2: stobj.showStudents();
		    			       adminPage();
		    			    	   break;
		    			   	   case 3:
		    				       break;

		       			
		       			
		       		         	}
			
		break;
		
		case 2:System.out.println();
		
	       System.out.println("**Books Page**");
	       
	       System.out.println();
	       System.out.println("1.Add Books");
	       System.out.println("2.Display all Books");
	       System.out.println("3.Exit");
	       
	       System.out.println("Enter any option:");
			int e=sc.nextInt();
			
	       			switch(e) {
	    			       case 1: bobj.addBooks();
	    			               adminPage();
	    			       
	    			           break;
	    			           
	    			       case 2: bobj.showBooks(); 
	    			    	       adminPage();
	    			    	   break;

	    			   	   case 3: 
	    			   	      	   adminPage();
	    				       break;
	       			
	       			
	       		         	}

		break;
	
		case 3:
			 System.out.println("**Manage Books Page**");
		       
		       System.out.println();
		       System.out.println("1.Issue Books");
		       System.out.println("2.Return Books");
		       System.out.println("3.Exit");
		       
		       System.out.println("Enter any option:");
				int f = sc.nextInt();
				
		       			switch(f) {
		       
		       			case 1: bobj.issueBook();
		       					adminPage();
		       					break;
		       
		       			case 2: bobj.returnBook();
		       					adminPage();
		       					break;
		       	
	
		       		}
		       			
		   break;
		}

	}

}
