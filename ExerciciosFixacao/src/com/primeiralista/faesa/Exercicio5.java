package com.primeiralista.faesa;

/*A conversão de graus Fahrenheit para Celsius é obtida pela fórmula: C = 5 / 9 * (F - 32)
 * Faça um algoritmo que leia um  valor em graus Centígrados e imprima seu correspondente 
 * em graus Fahrenheit.
 */

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
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
