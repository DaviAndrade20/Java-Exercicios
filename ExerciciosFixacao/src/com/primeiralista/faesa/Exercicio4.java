package com.primeiralista.faesa;

/* Em uma pizzaria, cada tulipa de chope custa R$1,80 e uma pizza mista grande custa R$25,00 mais R$ 3,50
 * por tipo de cobertura pedida (queijo, presunto, banana, etc.). Uma turma vai à pizzaria e pede uma
 * determinada quantidade de "chopes" e uma pizza grande com uma determinada quantidade de coberturas.
 * Faca um programa que calcula a conta e, sabendo que a será informada a quantidade de pessoas, quanto
 * que cada um deve pagar. Lembre-se dos 10% do garçom. 
 * 
 */

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Declaração de variáveis
		double chope = 1.80;
		double pizza = 25.00;
		double cobertura = 3.50;
		double conta, contaDividida, garcom, contaTotal;
		int quantidadePessoas, quantidadeChopes, quantidadeCoberturas;
		
		// Entrada de dados
		System.out.println("Quantas pessoas? ");
		quantidadePessoas = entrada.nextInt();
		System.out.println("Quantos chopes? ");
		quantidadeChopes = entrada.nextInt();
		System.out.println("Quantidade de coberturas: ");
		quantidadeCoberturas = entrada.nextInt();
		
		// Cálculos 
		conta = pizza + (chope * quantidadeChopes) + (cobertura * quantidadeCoberturas);
		garcom = conta * 0.10;
		contaTotal = conta + garcom;
		contaDividida = contaTotal / quantidadePessoas;
		
		System.out.printf("O total da conta foi: R$%.2f e ficou divido em R$%.2f para cada um, contando com os 10%% do garçom.", contaTotal, contaDividida);
		
		
		
		entrada.close();

	}

}
