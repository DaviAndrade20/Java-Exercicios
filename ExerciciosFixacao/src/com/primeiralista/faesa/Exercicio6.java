package com.primeiralista.faesa;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		System.out.println("Triplo: " + num * 3);
		System.out.println("Metade: " + (double)num / 2);
		System.out.printf("Raíz cúbica: %.2f%n", Math.cbrt(num));
		System.out.println("Fracionario: " + Math.pow(num, 2.0 / 3.0));
		
		
		
		entrada.close();

	}

}
