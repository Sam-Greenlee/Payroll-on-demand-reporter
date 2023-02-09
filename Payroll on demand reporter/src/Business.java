//Programmer: Samuel Greenlee
//Program: Java02 Program Assignment
//Description: This program will produce a console payroll-on-Demand report
//Date Created On: 2/14/2020

public class Business 
{
	//These are instance variables
	private int employeeNumber;
	private String employeeLastName;
	private String employeeFirstName;
	private int employeeSocialSecurityNum;
	private float hoursWorked;
	private float rateOfPay;
	
	//This is the constructor that sets each instance variable
	public Business()
	{		
		employeeNumber = 0;
		employeeLastName ="";
		employeeFirstName = "";
		employeeSocialSecurityNum = 0;
		hoursWorked = 0.0f;
		rateOfPay = 0.0f; 
	}
	
	//constructor accepts six arguments, and assigns those values into class variables
	public Business(int employeeNumber, String employeeLastName, String employeeFirstName,
			int employeeSocialSecurityNum, float hoursWorked, float rateOfPay)
	{
		this.employeeNumber = employeeNumber;
	  	this.employeeLastName = employeeLastName;
	  	this.employeeFirstName = employeeFirstName;
	  	this.employeeSocialSecurityNum = employeeSocialSecurityNum;	
	  	this.hoursWorked = hoursWorked;
	  	this.rateOfPay = rateOfPay;
	}
	
	//These are the get and set methods for the instance variables
	//******************************************************************
	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
	
	public void setEmployeeNumber(int employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}
	//********************************************************************	
	public String getEmployeeLastName()
	{
		return employeeLastName;
	}
	
	public void setEmployeeLastName(String employeeLastName)
	{
		this.employeeLastName = employeeLastName;
	}
	//***********************************************************************
	public String getEmployeeFirstName()
	{
		return employeeFirstName;
	}
	
	public void setEmployeeFirstName(String employeeFirstName)
	{
		this.employeeFirstName = employeeFirstName;
	}
	//*************************************************************************
	public int getEmployeeSocialSecurityNum()
	{
		return employeeSocialSecurityNum;
	}
	
	public void setEmployeeSocialSecurityNum(int employeeSocialSecurityNum)
	{
		this.employeeSocialSecurityNum = employeeSocialSecurityNum;
	}
	//****************************************************************************
	public float getHoursWorked()
	{
		return hoursWorked;
	}
	
	public void setHoursWorked(float hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	//********************************************************************************
	public float getRateOfPay()
	{
		return rateOfPay;
	}
	
	public void setRateOfPay(float rateOfPay)
	{
		this.rateOfPay = rateOfPay;
	}
	//*************************************************************************************
	//This is the method that calculates the gross pay
	public float calculateGrossPay()
	{
		float regularPay;
		float grossPay = 0;
		float overTimePay;
		
		if(hoursWorked <= 40)
		{
			regularPay = hoursWorked * rateOfPay;
			
			grossPay = regularPay;
		}
		else if(hoursWorked > 40)
		{
			regularPay = 40 * rateOfPay;
			
			overTimePay = (hoursWorked - 40) * rateOfPay * 1.5f; 
			
			grossPay = regularPay + overTimePay;
		}
				
		return grossPay;
	}	
}


