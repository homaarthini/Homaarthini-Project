package com.myworkout.practice;

import java.nio.channels.SelectionKey;
import java.util.Scanner;

public class Project1 {
	
	public String reverseStr(String name) {
		char[] reverse= new char[name.length()];
		int index=0;
		for(int i=name.length()-1; i>=0 ; i--) {
			reverse[index] =name.charAt(i);
			index++;
		}
		String reversed=new String(reverse);
		return reversed;
		}
	
	public String palindrome(String name) {
		char[] reverse= new char[name.length()];
		int index=0;
		String Palindrome;
		for(int i=name.length()-1; i>=0 ; i--) {
			reverse[index] =name.charAt(i);
			index++;
		}
		String reversed=new String(reverse);
		if(reversed.equalsIgnoreCase(name)) {
			Palindrome=reversed;
			System.out.println("Yes it is a palindrome");
		}
		else
			Palindrome="Not a Palindrome";
		return Palindrome;
	}
	
	public String sorting(String name) {
		char[] arr1=name.toCharArray();
		for(int j=0;j<arr1.length-1
				
				;j++) {
			for(int k=0;k<arr1.length-1;k++) {
				if(arr1[k]>arr1[k+1]) {
					char temp=arr1[k];
					arr1[k]=arr1[k+1];
					arr1[k+1]=temp;
				}
				
			}
		}
		String sortedStr=new String(arr1);
		return sortedStr;		
	}
	
	public String lowerCase(String name) {
		String converted=name.toLowerCase();
		return converted;
	}
	
	public String upperCase(String name) {
		String changed=name.toUpperCase();
		return changed;
	}
	
	public String switchCase(String name, String choice) {
		String output="";
		switch (choice) {
		case "1":
			System.out.println("Yay!...Lets make it Funny");
			output=reverseStr(name);
			break;
			
		case "2":
			System.out.println("Hmm!...Lets see if its a Palindrome");
			output=palindrome(name);
			break;
			
		case "3":
			System.out.println("That's a wise choice!");
			output=sorting(name);
			break;
			
		case "4":
			System.out.println("Great choice!");
			output=lowerCase(name);
			break;
			
		case "5":
			System.out.println("This option seems interesting!");
			output=upperCase(name);
			break;

		default:
			System.out.println("Invalid option");
			break;
		}
		return output;
	}
	public static void main(String args[]) {
		Project1 calling=new Project1();
		boolean option = false;
		boolean strcontinue=false;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Options given below");
		System.out.println("1.Reverse");
		System.out.println("2.Palindrome");
		System.out.println("3.Sort");
		System.out.println("4.Lowercase");
		System.out.println("5.Uppercase");
		System.out.println("Choose the option:");
		String choice = sc.nextLine();
		
		do {
		System.out.println("Enter your String");
		String name=sc.nextLine();	
		String result=calling.switchCase(name, choice);
		System.out.println(result);
		
		String userChoice = calling.selection();	
		boolean isCorrectInput = true;
		while(isCorrectInput) {
		if(userChoice.equalsIgnoreCase("Yes") || userChoice.equalsIgnoreCase("No")) {
					isCorrectInput = false;		
			} else {
				System.out.println("Invalid choice, Please revisit your choice");
				userChoice = calling.selection();
				isCorrectInput = true;	
			}
		}
		
		   if(userChoice.equalsIgnoreCase("Yes")) {
				strcontinue = true;
			} else {
				strcontinue = false;
			}
		} while(strcontinue);
		
		System.out.println("Do you want to go to main menu? Yes or No");
		String decideMainMenu = sc.nextLine();
		boolean isCorrectSelection = true;
		while(isCorrectSelection) {
		if(decideMainMenu.equalsIgnoreCase("Yes") || decideMainMenu.equalsIgnoreCase("No")) {
			isCorrectSelection = false;		
			} else {
				System.out.println("Invalid choice, Please revisit your choice");
				decideMainMenu =sc.nextLine();
				isCorrectSelection = true;	
			}
		}
		
		option = decideMainMenu.equalsIgnoreCase("Yes") ? true : false;
		}  while(option);
		
		System.out.println("Thank you!");
		
		
	}
	
	String selection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to enter another string? Yes or No");
		String userChoice = sc.nextLine();
		return userChoice;
	}
}


	