package com.primeiralista.faesa;

/* Escrever um algoritmo que lê:
 * a) a porcentagem do IPI a ser acrescido no valor das peças
 * b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1
 * c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado
 * Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double ipi, valorUnitarioPeca1, valorUnitarioPeca2, total;
		
		System.out.println("Digite a porcentagem do IPI: ");
		ipi = sc.nextDouble();
		
		// Peca 1
		System.out.println("Digite o codigo da peça 1: ");
		codigoPeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		valorUnitarioPeca1 = sc.nextDouble();
		System.out.println("Digite a quantidade de peças desse item:  ");
		quantidadePeca1 = sc.nextInt();
		
		// Peça 2
		System.out.println("Digite o codigo da peça 2: ");
		codigoPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		valorUnitarioPeca2 = sc.nextDouble();
		System.out.println("Digite a quantidade de peças desse item:  ");
		quantidadePeca2 = sc.nextInt();
		
		total = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2)*(ipi/100 + 1);
		
		System.out.printf("Total: R$%.2f", total);
		
		
		sc.close();

	}

}
