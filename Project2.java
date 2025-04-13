package com.myworkout.practice;

import java.util.Scanner;

public class Project2 {
	public int additon(int a,int b) {	
		int	result=a+b;
		return result;		
	}
	
	public int subtraction(int a,int b) {
		int result=a-b;
		return result;		
	}
	
	public int multiply(int a,int b) {
		int result=a*b;
		return result;		
	}
	
	public int divide(int a,int b) {
		int result=0;
		try {
			result=a/b;
		} catch(Exception e) {
			System.out.println("Cannot divide by 0");
		}
		return result;		
	}
	
	public int reverseNum(int a) {
		int result=0;
		while(a!=0) {
		int remainder=a%10;
		result=result*10+remainder;
		a=a/10;
		}
		int reversed=result;
		return reversed;
	}
	
	public boolean palindrome(int a) {
		boolean isPalindrome=false;
		int result=0;
		int temp=a;
		while(a!=0) {
		int remainder=a%10;
		result=result*10+remainder;
		a=a/10;
		}
		if(result==temp) {
			System.out.println("Is palindrome");
			isPalindrome=true;
		} else {
			System.out.println("not a palindrome");
		    isPalindrome=false;
		}
		return isPalindrome;	
	}
	
	public boolean primeNum(int a) {
		boolean isPrime=false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				isPrime=false;
				break;
			}
			else
				isPrime=true;
		}
		return isPrime;
	}
	
	public int switchNum(String name,int a,int b) {
		int result=0;
		switch (name) {
		case "1":
			System.out.println("Let's Add");
			result=additon(a,b);
			break;
		case "2":
			System.out.println("Let's Subtract");
			result=subtraction(a, b);	
			break;
		case "3":
			System.out.println("Let's Multiply");
			result=multiply(a, b);	
			break;
		case "4":
			System.out.println("Let's Divide");
			result=divide(a, b);	
			break;
		
		default:
			System.out.println("Invalid option");
			break;
		}
		return result;
	}
	
	public boolean switchBoo(String name,int a) {
		boolean decision=true;
		
		switch (name) {
		case "5":
			decision=palindrome(a);
			break;
			
		case "6":
			decision=primeNum(a);
			break;
			
		
		default:
			System.out.println("Invalid option");
			break;
		}
		return decision;
	}
	
	String selection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to enter another string? Yes or No");
		String userChoice = sc.nextLine();
		return userChoice;
	}
	
	public static void main(String args[]) {
		Project2 calling=new Project2();
		Scanner sc = new Scanner(System.in);
		boolean strcontinue=true;
		boolean cont=true;
		boolean repeat=true;
		do {
			System.out.println("Choose any option");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Check Palindrome");
			System.out.println("6.Check Prime");
			String choice=sc.nextLine();
			do {
				
			if(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") ) {
				System.out.println("Enter Two numbers: ");
				int a=0;
				int b=0;
				try {
					a=sc.nextInt();
					b=sc.nextInt();
					int result=calling.switchNum(choice, a, b);
					System.out.println("Answer is: "+result);
				} catch(Exception e) {
					
					System.out.println("Only numbers are allowed in input");
					sc.nextLine();
				}
				
				
			} else if(choice.equals("5") || choice.equals("6")) {
				try {
					System.out.println("Enter one number");
					int a=sc.nextInt();
					boolean ans=calling.switchBoo(choice, a);
					System.out.println(ans);
				} catch(Exception e) {
					System.out.println("Only numbers are allowed in input");
				}
				
			} else {
				
				System.out.println("Invalid option");
				repeat=false;
			}
			
			
			
			String decided ="";
			
			while(repeat) {
				decided =calling.selection();
			if(decided.equalsIgnoreCase("Yes") || decided.equalsIgnoreCase("No")) {
						repeat = false;		
				} else {
					System.out.println("Invalid choice, Please revisit your choice");
					//decided = calling.selection();
					//repeat = true;	
				}
			}
			
			   if(decided.equalsIgnoreCase("Yes")) {
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
			
			cont = decideMainMenu.equalsIgnoreCase("Yes") ? true : false;
		} while(cont);
		
		System.out.println("Thank you");
		
	}

}
