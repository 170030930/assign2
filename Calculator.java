package org.klu.calculator;

	import java.util.*;
	 class MyCalculator {
		 int result,remainder,number1,number2;
		 double result2;
		 Scanner scan=new Scanner(System.in); 
		 void add(){
		  System.out.print("Enter two numbers for addition :");
		  number1=scan.nextInt();
		  number2=scan.nextInt();
		 result = number1+number2;
		 System.out.println("Sum of the numbers is :" +result);
		 }
		 void sub(){
		  System.out.print("Enter numbers for subtraction : ");
		  number1=scan.nextInt();
		  number2=scan.nextInt();
		 result = number1-number2;
		 System.out.println("Subtraction or Difference  of numbers is :" +result);
		 }
		 void div(){
		  System.out.print("Enter the numbers for division : ");
		  number1=scan.nextInt();
		  number2=scan.nextInt();
		 result2 = number1/number2;
		 remainder = number1%number2;
		 System.out.println("Division of two numbers is :" +result2);
		 System.out.println("Remainder for division of two numbers is :" +remainder);
		 }
		 void multi(){
		  System.out.print("Enter the numbers for multiplication : ");
		  number1=scan.nextInt();
		  number2=scan.nextInt();
		 result = number1*number2;
		 System.out.println("multiplication of two numbers is :" +result);
		 }
		}
		  //Calculator is the main class
		
	 class Calculator{
		public static void main(String[] arr){
		  MyCalculator obj = new MyCalculator();
		 Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtracion");
		System.out.println("Enter 3 for division");
		System.out.println("Enter 4 for multiplication");
		int c = scan.nextInt();
		switch(c){
		    case 1 :
		 obj.add();
		 break;
		 case 2 :
		 obj.sub();
		 break;
		 case 3 :
		 obj.div();
		 break;
		 case 4 :
		 obj.multi();
		 break;
		 default :
			 System.out.println("Enter correct choice");
		}
	  }
	}
