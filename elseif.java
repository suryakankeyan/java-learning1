package javalearning;
import java.util.Scanner;//import scanner to input in console

public class elseif {//creating the class

	public static void main(String[] args) {// Java main method
		// TODO Auto-generated method stub
		float avg;//choose type to variable
		System.out.println("enter the mark");//print statement
		Scanner input=new Scanner(System.in);//scanner used to take user input
		avg=input.nextFloat();//Scans the next token of the input as an int
		if (avg>=90 && avg<=100 ) {//if condition to take input true or false
			System.out.println("grade A ");//print statement
		}
		else if (avg>=80 && avg<=89 ) {
			System.out.println("grade B ");//print statement
		}
		else if (avg>=70 && avg<=79 ) {
			System.out.println("grade c ");//print statement
		}
		else{
			System.out.println("grade d ");//print statement
		}
	}

}
