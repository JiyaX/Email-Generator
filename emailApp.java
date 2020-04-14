package AutomatedEmailGeneration;

import java.util.Scanner;

public class emailApp
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLenght = 8;
	private int mailBoxCapacity = 500; 
	private String alternateEmail;
	private String companySuffix = "Jiya&Company.com";
	
	// Constructor to receive first and last name
	public emailApp(String firstName, String lastName, int passwordLenght, String companySuffix)
  {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		
		
		this.defaultPasswordLenght = passwordLenght;
	
		this.password = randomPassword(this.defaultPasswordLenght);
		
		System.out.println("Your password is: " + this.password);
		
		// combine elements to generate the e-mail
		this.companySuffix = companySuffix;
	
		//converting the given info to a valid email address
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + this.companySuffix;
		System.out.println("Your e-mail was created: " + this.email);
	}
	
	
	// ask for the department options 1,2,3,0
	
	private String setDepartment()
	{
		System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 none\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2 ) {return "dev";}
		else if (depChoice == 3 ) {return "acct";}
		else {return "";}
	}
	
	// generate random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKMLNOPQRSTUVXZ0123456789!@#$";
		
		char[] password = new char[length];
		for (int i=0; i<length; i++)
		{
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	// set mail box capacity
	public void setMailBoxCapacity(int capacity) 
	{
		this.mailBoxCapacity = capacity;
		}
	
	// set alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
		}
	
	//set new email
	public void setNewEmail(String newEmail) 
	{
		this.email = newEmail;
		}
	
	// change password
	public void changePassword(String passwrd) {this.password = passwrd;}
	
	
	public int getMailBoxCapacity() { return mailBoxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	
	
	public String showInfo() {
	return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
			"COMPANY E-MAIL: " + email + "\n"+
			"MAILBOX CAPACITY: " + mailBoxCapacity + "mb";
	
	}}


