package studentsInformation;
import java.util.Scanner;
public class Students 
{
	final int total_std=5;
	String[] sName = new String[total_std];
	int[] sRollNo = new int[total_std];
	
	Scanner stusc= new Scanner(System.in);
	
	
	public void studentAdd() 
	{
		System.out.println("Add Student Name And Roll No.");
		
		for(int i=0; i<total_std; i++) 
		{
			System.out.print("Enter Roll No -");
			sRollNo[i]= stusc.nextInt();
			
			System.out.print("Enter Name -");
			sName[i]= stusc.next();	
		
		}
		System.out.println();
		
		System.out.println("Data saved sucsseful");
		
		
	}
	
	public void showStudents()
	{
         System.out.println("List of Students and Roll No.");
		
		for(int j=0;j<total_std; j++) 
		{
			
			System.out.print(j+1+"> "+sRollNo[j]+" -  ");
			System.out.println(sName[j]);
			
		}
	}
	
	
	
}

