package com.segundalista.faesa;

/* Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
 *  Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
 *  médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
 *  crédito. 
 */

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saldoMedio, percentual, credito;
		System.out.println("===============TABELA==============");
		System.out.println("SALDO MÉDIO | PERCENTUAL");
		System.out.println("Até 200 - Nenhum crédito");
		System.out.println("Maior que 200 até 400 - 10% do valor do saldo médio");
		System.out.println("Acima de 400 - 20% do valor do saldo médio");
		System.out.println();
		
		System.out.println("Saldo médio: ");
		saldoMedio = scan.nextDouble();
		
		scan.close();
		
		if(saldoMedio <= 200) {
			percentual = 0.0;
		} else if (saldoMedio > 200 && saldoMedio <= 400) {
			 percentual = 10.0;
		} else {
			percentual = 20.0;
		}
		
		credito = saldoMedio * (percentual/100);
		
		System.out.printf("Saldo Médio: R$ %.2f%n", saldoMedio);
		System.out.printf("Valor do Crédito: R$ %.2f%n", credito);

	}

}
