package com.segundalista.faesa;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double hasteAluminio = 4.00;
		final double hasteCobre = 2.00;
		
		int quantidadeAluminio, quantidadeCobre, quantidadeTotal;
		double percentualDesconto, valorDesconto, valorSemDesconto, precoFinal;
		
		System.out.println("===============TABELA==============");
		System.out.println("QNTD COMPRADA| PERCENTUAL DESC");
		System.out.println("Abaixo de 5 - 0");
		System.out.println("Entre 5 e 15 - 10");
		System.out.println("Entre 16 e 20 - 15");
		System.out.println("Acima de 20 - 20");
		System.out.println();
		
		System.out.println("Quantidade de haste de alumínio comprada: ");
		quantidadeAluminio = sc.nextInt();
		System.out.println("Quantidade de haste de cobre comprada: ");
		quantidadeCobre = sc.nextInt();
		
		sc.close();
		
		quantidadeTotal = quantidadeAluminio + quantidadeCobre;
		valorSemDesconto = (quantidadeAluminio * hasteAluminio) + (quantidadeCobre * hasteCobre);
		
		System.out.println("Quantidade Total: " + quantidadeTotal);
		System.out.println();
		System.out.println("Valor sem desconto: R$" + valorSemDesconto);
		
		
		if (quantidadeTotal < 5) {
			System.out.println("Não há desconto.");
			System.out.println("Valor a pagar: R$" + valorSemDesconto);
		} else if (quantidadeTotal >= 5 && quantidadeTotal <= 15) {
			percentualDesconto = 0.10;
			valorDesconto = valorSemDesconto * percentualDesconto;
			precoFinal = valorSemDesconto - valorDesconto;
			System.out.printf("Valor a pagar: %.2f%n", precoFinal);
		} else if (quantidadeTotal >= 16 && quantidadeTotal <= 20) {
			percentualDesconto = 0.15;
			valorDesconto = valorSemDesconto * percentualDesconto;
			precoFinal = valorSemDesconto - valorDesconto;
			System.out.printf("Valor a pagar: %.2f%n", precoFinal);
		} else {
			percentualDesconto = 0.20;
			valorDesconto = valorSemDesconto * percentualDesconto;
			precoFinal = valorSemDesconto - valorDesconto;
			System.out.printf("Valor a pagar: %.2f%n", precoFinal);
		}
		
		
		

	}

}
