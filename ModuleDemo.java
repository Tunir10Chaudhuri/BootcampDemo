package com.telstrabootcamp.testing;
import java.util.Scanner;
public class ModuleDemo {

	public int getCharges(int levelOfService)
	{
		switch(levelOfService)
		{
		case 1:
			return 100;
		case 2:
			return 500;
		case 3:
			return 2000;
		default:
			return 0;
		}
	}
	
	public int getLevel(int rating)
	{
		switch(rating)
		{
		case 0:
		case 1:
			return 1;
		case 2:
		case 3:		
			return 2;
		case 4:
		case 5:	
			return 3;
		default:
			return 0;
		}
	}
	
	public int convertIntoHundred(int rating,int subrating)
	{
		return rating*10+subrating;
	}
	
	public String messageGenerate(int rating)
	{
		switch(rating)
		{
		case 0:
		case 1:
			return "We are sorry to hear that.";
		case 2:
		case 3:		
			return "We will try to improve.";
		case 4:
		case 5:	
			return "Thank you very much.";
		default:
			return "Your rating is rejected because it is invalid.";
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide your ratings(0-5) and we will calculate your charge.");
		int rating=sc.nextInt();
		ModuleDemo md1=new ModuleDemo();
		System.out.println(md1.messageGenerate(rating)+"\nYou need to pay INR "+md1.getCharges(md1.getLevel(rating))+" only.");
		System.out.println("Please provide your subrating(0-9) based on your checkout experience (This will not be disclosed).");
		int subrating=sc.nextInt();
		System.out.println("Your total rating (private) = "+md1.convertIntoHundred(rating,subrating));
	}
}
