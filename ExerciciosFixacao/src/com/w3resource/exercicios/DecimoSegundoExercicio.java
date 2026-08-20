package com.w3resource.exercicios;

import java.util.Scanner;
public class DecimoSegundoExercicio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/* Average of Three Numbers
		  Write a Java program that takes three numbers 
		  as input to calculate and print the average of 
		  the numbers.
		 */
		
		int n1, n2, n3, average;
		
		System.out.println("Input the first number: ");
		n1 = in.nextInt();
		System.out.println("Input the second number: ");
		n2 = in.nextInt();
		System.out.println("Input the third number: ");
		n3 = in.nextInt();
		
		average = (n1 + n2 + n3)/3;
		System.out.printf("The average is: %d", average);
		in.close();
	}

}
