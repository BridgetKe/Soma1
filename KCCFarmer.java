//Modeling a KCC farmer's account
/*Farmer sells to KCC and KCC deposits money to the account
With this system the farmer will withdraw, deposit & check balance.*/
import java.io.*;
import java.util.*;

public class KCCFarmer {
	private String FName; //Farmer Name
	private String FRegion; //Farmer Region
	private double FAccountNum; //Farmer Account Identification number
	private double FBalance; //Farmer Balance
	
//Set	
public void set_Name(String FName_in) { FName=FName_in; }
public void set_Region(String FRegion_in) { FRegion=FRegion_in; }
public void set_AcNum(double FNum_in) { FAccountNum=FNum_in; }
public void set_Balance(double FBalance_in) { FBalance=FBalance_in; }

//Get
public String get_FName () {return FName; } 
public String get_Region (){return FRegion; } 
public double get_AcNum() {return FAccountNum; } 
public double get_Balance () {return FBalance; } 


public  void deposit(double amount){ FBalance = FBalance + amount; }
public  void withdraw(double amount){FBalance = FBalance - amount; }

public static void main(String[] args)throws IOException {
	KCCFarmer c=new KCCFarmer();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	 String FName_in=sc.next();
	 c.set_Name(FName_in);
	 
	 System.out.println("Enter your region: ");
	 String FRegion_in=sc.next();
	 c.set_Region(FRegion_in);
	
	 System.out.println("Enter your KCC account Number: ");
	 int FNum_in=sc.nextInt();
	 c.set_AcNum(FNum_in);
	 
	 System.out.println("Enter your initial balance");
	 double FBalance_in=sc.nextDouble();
	 c.set_Balance(FBalance_in);
	 
	 //Output
	 System.out.println("Farmers Name: "+c.get_FName());
	 System.out.println("\n Farmers Region: "+c.get_Region());
	 System.out.println("\n Account Number:"+c.get_AcNum());
	 System.out.println("\n Balance:"+c.get_Balance());
	 
	 //Deposit
	 System.out.println("How much will you deposit today: ");
	 double amount=sc.nextDouble();
	 c.deposit(amount);
	 
	 //Deposit Output
	 System.out.println("Your New Balance:"+c.get_Balance());
	 
	 //Withdraw
	 System.out.println("How much will you withdraw today: ");
	 amount=sc.nextDouble();
	 c.withdraw(amount);
	 
	 //Withdraw output
	 System.out.println("Balance:"+c.get_Balance());
	}
	}
