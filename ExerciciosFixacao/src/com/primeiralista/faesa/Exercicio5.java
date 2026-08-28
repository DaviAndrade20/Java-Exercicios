package com.primeiralista.faesa;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.print("Digite o grau Celsius: ");
		c = scan.nextDouble();
		
		f = ((9.0 / 5.0) * c) + 32;
		
		System.out.printf("O correspondente de %.2f em farenheit é %.1f", c, f);
		
		scan.close();

	}

}
