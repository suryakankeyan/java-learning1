package javalearning;
import java.util.Scanner; //import scanner to input in console

public class ifstatement { //creating the class

	public static void main(String[] args) { // Java main method 
		int age; //choose type to variable
		System.out.println("enter the age"); //print statement
		Scanner input =new Scanner(System.in);//scanner used to take user input
		age=input.nextInt();//Scans the next token of the input as an int
		if(age >= 18)//if condition to take input true or false
		{
			System.out.println("you are eligible for vote");
		}else {			
			System.out.println("not eligible for vote");
		}
	}

}
