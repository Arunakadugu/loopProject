package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("enter the number: ");
		Scanner keyboard = new Scanner(System.in); // get input from the user
		int i = keyboard.nextInt();
		// while loop to print sum of first i digits
		// int sum = 0, counter = 1;

		/*
		while(counter <= i){
			sum += counter;
			counter++;
		}*/

		/* do{
			sum += counter;
			counter++;
		}while(counter <= i);S

*/
		/* int n = 0, sum =0, int counter = 0;
		while(counter <= n){
			sum = sum + counter;
			System.out.print("(" +counter+ ")");
			counter++;
		}
		*/




		int sum;
		sum = 0;
		int n = 0;

		do{
			sum = sum + n;
			n++;
		}while (n<=i);
		{
			System.out.print(sum);

		}
		System.out.println(); //print a blank line
		System.out.println(i > 50); // prints the value of expression
		System.out.println(i < 50);

	}
}

