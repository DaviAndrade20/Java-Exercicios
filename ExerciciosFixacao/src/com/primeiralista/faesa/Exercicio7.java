package com.primeiralista.faesa;

/* Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e  
 *  P(x2,y2), escreva a distância entre eles.
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x1, y1, x2, y2;
		
		// Plano 1
		System.out.println("Valor de x1: ");
		x1 = entrada.nextDouble();
		System.out.println("Valor de y1: ");
		y1 = entrada.nextDouble();
		
		// Plano 2
		System.out.println("Valor de x2: ");
		x2 = entrada.nextDouble();
		System.out.println("Valor de y2: ");
		y2 = entrada.nextDouble();
		
		
		System.out.printf("Distância: %.2f", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		entrada.close();
	}

}
