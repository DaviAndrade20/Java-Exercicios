package com.primeiralista.faesa;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int distancia, tempo, velocidadeMedia;
		
		System.out.println("Qual o nome do piloto: ");
		nome = entrada.nextLine();
		System.out.println("Qual a distância percorrida: ");
		distancia = entrada.nextInt();
		System.out.println("Qual o tempo percorrido: ");
		tempo = entrada.nextInt();
		
		velocidadeMedia = distancia/tempo;
		
		System.out.printf("A velocidade média de %s foi %dkm/h", nome, velocidadeMedia);
		
		
		entrada.close();
	}

}
