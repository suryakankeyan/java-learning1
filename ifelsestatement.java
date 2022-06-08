package javalearning;
import java.util.Scanner;//import scanner to input in console

public class ifelsestatement {//creating the class

	public static void main(String[] args) {// Java main method
		int year;//choose type to variable
		System.out.println("enter the year :");//print statement
		Scanner input = new Scanner(System.in);//scanner used to take user input
		year=input.nextInt();//Scans the next token of the input as an int
		if(year%4==0||(year %100==0 && year %400==0)) {//if condition to take input true or fals
			System.out.println("year"+year+"is a leap year");
		}else {
			System.out.println("year"+year+"is not a leap year ");
		}

	}

}
