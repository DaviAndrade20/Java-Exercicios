package com.segundalista.faesa;

import java.util.Scanner;

/*Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
 *correspondente ao resultado. Se o número for zero, imprima: “o valor é zero” 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		if(numero == 0) {
			System.out.println("O número é igual a 0.");
		} else if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar.");
		}
		
		
		
		
		
		entrada.close();

	}

}
