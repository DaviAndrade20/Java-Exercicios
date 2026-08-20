package com.primeiralista.faesa;

/* Faça um programa que leia três valores inteiros, calcule e exiba a sua média ponderada. 
 * A primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. 
 */

import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Declaração de variáveis
		int n1, n2, n3;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		int mediaPonderada;
		
		// Entrada de dados
		System.out.println("Digite o primeiro valor: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o primeiro valor: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o primeiro valor: ");
		n3 = entrada.nextInt();
		
		// Cálculo da média e exibição do resultado
		mediaPonderada = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)/(peso1 + peso2 + peso3));
		
		System.out.printf("A média ponderada de suas notas: %d", mediaPonderada);
		
		entrada.close();
	}
}