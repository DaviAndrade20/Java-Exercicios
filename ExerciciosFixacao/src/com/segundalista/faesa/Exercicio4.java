package com.segundalista.faesa;

import java.util.Scanner;

/* Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
 * conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
 * novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
 * salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA) 
 */

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario, percentual, aumento, novoSalario;
		int codigo;
		
		System.out.println("===============TABELA==============");
		System.out.println("CÓDIGO DO CARGO | PERCENTUAL");
		System.out.println("101 - Gerente - 10%");
		System.out.println("102 - Engenheiro - 20%");
		System.out.println("103 - Técnico - 30%");
		System.out.println();
		
		System.out.println("Digite o salário: ");
		salario = teclado.nextDouble();		
		System.out.println("Digite o código do cargo: ");
		codigo = teclado.nextInt();
		
		teclado.close();
		
		switch (codigo) {
			case 101:
				percentual = 10.0;
				break;
			case 102:
				percentual = 20.0;
				break;
			case 103:
				percentual = 30.0;
				break;
			default:
				percentual = 5.0;
				break;
		}

		aumento = salario * (percentual / 100.0);
		novoSalario = salario + aumento;
		System.out.println("\n---------------RESULTADO---------------");
		System.out.printf("Salário antigo: R$ %.2f%n", salario);
		System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
		System.out.printf("Diferença: R$ %.2f%n", aumento);
	}
}