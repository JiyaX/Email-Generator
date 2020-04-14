
package AutomatedEmailGeneration;

import java.util.Scanner;

public class email {
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
    
		System.out.println("Enter First Name");
		String a= scan.nextLine();
    
		System.out.println("Enter Last Name");
		String b= scan.nextLine();
    
		System.out.println("Enter Length of Password");
		int c=scan.nextInt();
		
		
		emailApp em1 = new emailApp (a,b,c,"Jiya&Company.com");
		
		em1.changePassword("newpassword");
		
		em1.setAlternateEmail("johnsmth@sales.mycompany.com");
		
		em1.setNewEmail("jg@sales.mycompany.com");
    
		
		System.out.println(em1.showInfo());
	}

}


