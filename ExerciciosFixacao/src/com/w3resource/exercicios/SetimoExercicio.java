package com.w3resource.exercicios;

import java.util.Scanner;
public class SetimoExercicio {

	public static void main(String[] args) {
		// Tabuada com loop for
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Input a number: ");
		num = entrada.nextInt();
		
		for (int i = 0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		entrada.close();
	}

}
