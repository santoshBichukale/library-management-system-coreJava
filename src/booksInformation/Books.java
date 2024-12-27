package booksInformation;
import java.util.Scanner;

import studentsInformation.BookVO;
import studentsInformation.Students;
public class Books extends Students
	{
	int total_Books=3 ;
	
	String [] bName = new String[total_Books];
	
	Scanner sc= new Scanner(System.in);
	Students student = new Students();
	BookVO[] book = new BookVO[5];
	
	//1.Create an Array for Issue and Return Book
	//2.Once book is issued remove book entry from book array and add in new array cretaed issue book
	//3.Once Book is returned do vice versa of point second.
	
	public void addBooks() {


		System.out.println("*** Add Books ***");
		
		for(int i=0; i<total_Books; i++) 
		{
			
			System.out.println("Enter Book name-  ");
			bName[i]= sc.next();
		}
		
		System.out.println();
		System.out.println("All books Added Sucessful");
		
		
	}
	
	public void showBooks() 
	{
		System.out.println("List of books Available in Library");
		
		for(int j = 0; j<total_Books; j++) {
			System.out.println(j+1+"> "+bName[j]);
			}
	}
	
	public void issueBook() {
		
		System.out.println("Issue book to Student");
		
	
		
		System.out.println("Enter Student roll No.");
		int issue_std = sc.nextInt();
		System.out.println("Enter book Name ");
		String issue_book= sc.next();
		
		/*  in process issue book
		 * 
		for(int j= 0; j<total_Books; j++) 
		{
			if(bName[j].equals(issue_book) )
			{
				for(int k = j; k<total_Books; k++) 
				{
					
					bName[k]= bName[ k+1];
			
					
					
				}
				
			 
			}
			
			else {
				System.out.println("Book not available");
				
			}
			;
			
		}
		*/
		
		
		
	}
	
	public void returnBook() {
		
		
		
	}
	

}

