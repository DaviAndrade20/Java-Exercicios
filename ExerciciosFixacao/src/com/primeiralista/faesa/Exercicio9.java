package com.primeiralista.faesa;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ipi, codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2, total;
		
		System.out.println("Digite a porcentagem do IPI: ");
		ipi = sc.nextInt();
		
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
