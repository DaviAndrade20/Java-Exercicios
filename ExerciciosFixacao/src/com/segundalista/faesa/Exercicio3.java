package com.segundalista.faesa;

import java.util.Scanner;

/*Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
 * usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
 * mensagem de erro. (utilize a estrutura ESCOLHA) 
 */

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, opcao;
		
		System.out.println("Digite o valor do primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		num2 = scan.nextInt();
		
		
		System.out.println("-------------------MENU DE OPERAÇÕES-------------------");
		System.out.println("1 - SOMA");
		System.out.println("2 - DIVISÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - SUBTRAÇÃO");
		
		System.out.println("Digite a opção desejada: ");
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Soma: " + (num1 + num2));
				break;
			case 2:
				if (num2 == 0) {
					System.out.println("ERRO: Divisão indeterminada.");
				} else {
					System.out.println("Divisão: " + ((double)num1 / num2));
				}
				break;
			case 3:
				System.out.println("Multiplicação: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Subtração: " + (num1 - num2));
				break;
			default:
				System.out.println("Opção inválida.");
		}
		
		scan.close();

	}

}
