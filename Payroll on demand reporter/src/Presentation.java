//Programmer: Samuel Greenlee
//Program: Java02 Program Assignment
//Description: This program will produce a console payroll-on-Demand report
//Date Created On: 2/14/2020

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Business account1 = new Business();//Instantiates Business
		
		String answer = "";
		
		//Continues until the user enters anything besides "y"
		do
		{	
			
		//Passes the objects of Business and Scanner to each method	
		checkEmployeeNumber(account1,sc);
		checkEmployeeLastName(account1,sc);
		checkEmployeeFirstName(account1,sc);
		checkSocialSecurityNum(account1,sc);
		checkHoursWorked(account1,sc);
		checkRateOfPay(account1,sc);
		
		calcBalance(account1);
	 	
	 	//Statement that asks the user if her or she wants to continue
	 	System.out.print("Do you wish to continue? ");
	 	
	 	answer = sc.next();
	 	
     	sc.nextLine();
	 	
	 	//Continues until the user enters anything besides "y"
	 	}while(answer.equalsIgnoreCase("y"));  
	}
	
	//This method gets the employeeNumber, and then checks it	
	public static void checkEmployeeNumber(Business account1, Scanner sc)
	{
		 String employeeNumber = "";
		 int min = 1;
		 int max = 5000;
		 boolean errorCheck = false;
		 
		 do
		 	{   
	  	 		System.out.print("Employee number: ");
	  	 		employeeNumber = sc.nextLine();
	  	 		errorCheck = Validation.isInteger(employeeNumber, "Employee number")&&  
			     		     Validation.isWithinRangeInteger(employeeNumber, min, max,"Employee number");
			
		 	}while(!errorCheck);
		 
		 	account1.setEmployeeNumber(Integer.parseInt(employeeNumber));
	}
		
	//This method gets the employeeLastName, and then checks it
	public static void checkEmployeeLastName(Business account1, Scanner sc)
	{
		String employeeLastName = "";
		boolean errorCheck = false;
			
			do
	  		{
	 			System.out.print("Employee last name: ");
	 			employeeLastName = sc.nextLine();
	 			errorCheck = Validation.isStringPresent(employeeLastName, "Employee last name");

	 		
	  		}while(!errorCheck);

			account1.setEmployeeLastName(employeeLastName);
	}
		
	//This method gets the employeeFirstName, and then checks it
	public static void checkEmployeeFirstName(Business account1, Scanner sc)
	{
		String employeeFirstName = "";
		boolean errorCheck = false;
			
			do
	  		{
	 			System.out.print("Employee first name: ");
	 			employeeFirstName = sc.nextLine();
	 			errorCheck = Validation.isStringPresent(employeeFirstName, "Employee first name");

	 		
	  		}while(!errorCheck);

			account1.setEmployeeFirstName(employeeFirstName);
	}
	
	//This method gets the employeeSocialSecurityNum, and then checks it
	public static void checkSocialSecurityNum(Business account1, Scanner sc)
	{
		String employeeSocialSecurityNum= "";
		int min = 111111111;
		int max = 999999999;
		boolean errorCheck = false;
		
		do
	 	{
			System.out.print("Employee social security number: ");
			employeeSocialSecurityNum = sc.nextLine();
 	 		errorCheck = Validation.isInteger(employeeSocialSecurityNum, "Employee social security number")&&  
 	 					 Validation.isWithinRangeInteger(employeeSocialSecurityNum, min, max,"Employee number");
		
	 	}while(!errorCheck);
		
		account1.setEmployeeSocialSecurityNum(Integer.parseInt(employeeSocialSecurityNum));
	}
	
	//This method gets the hoursWorked, and then checks it
	public static void checkHoursWorked(Business account1, Scanner sc)
	{
		 String hoursWorked = "";
		 float min = .25f;
		 float max = 80.00f;
		 boolean errorCheck = false;
		 
		 do
		 {   
				System.out.print("Hours worked: ");
				hoursWorked = sc.nextLine();
	  	 		errorCheck = Validation.isDouble(hoursWorked, "Hours worked")&&
			     		     Validation.isWithinRangeDouble(hoursWorked, min, max,"Hours worked");
			
		 }while(!errorCheck);
		 
		 account1.setHoursWorked(Float.parseFloat(hoursWorked));
		 
	}
	
	//This method gets the rateOfPay, and then checks it
	public static void checkRateOfPay(Business account1, Scanner sc)
	{
		 String rateOfPay = "";
		 float min = 9.00f;
		 float max = 25.00f;
		 boolean errorCheck = false;
		 
		 do
		 {   
				System.out.print("Rate of pay: ");
				rateOfPay = sc.nextLine();
	  	 		errorCheck = Validation.isDouble(rateOfPay, "Rate of pay")&&
			     		     Validation.isWithinRangeDouble(rateOfPay, min, max,"Rate of pay");
			
		 }while(!errorCheck);
	 	 
		 account1.setRateOfPay(Float.parseFloat(rateOfPay));
	}
	
	//This gives the user the desired output
	public static void calcBalance(Business account1)
  	{
		System.out.println("Your employee number is: " + account1.getEmployeeNumber()
		+ "\nYour employee last name is: " + account1.getEmployeeLastName()
		+ "\nYour employee first name is: " + account1.getEmployeeFirstName()
		+ "\nYour employee social security number is: " + account1.getEmployeeSocialSecurityNum()
		+ "\nYour hours worked is: " + account1.getHoursWorked()
		+ "\nYour rate of pay is: " + account1.getRateOfPay()			
		+ "\nThe amount of money you get for your gross pay is: " + Validation.formatAndRound(account1.calculateGrossPay()));
	}
		
		
	
	

}
