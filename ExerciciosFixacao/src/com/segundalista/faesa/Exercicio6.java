package com.segundalista.faesa;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da carga (10 a 40): ");
        int codigo = sc.nextInt();

        System.out.print("Digite o peso da carga (em toneladas): ");
        double pesoTon = sc.nextDouble();
        sc.close();

        if (codigo < 10 || codigo > 40) {
            System.out.println("código inválido");
        } else {
            double pesoKg = pesoTon * 1000.0;
            double precoPorKg = 0;

            if (codigo <= 20) {
                precoPorKg = 100.0;
            } else if (codigo <= 30) {
                precoPorKg = 250.0;
            } else {
                precoPorKg = 330.0;
            }

            double precoTotal = pesoKg * precoPorKg;

            System.out.printf("Peso em quilos: %.2f kg%n", pesoKg);
            System.out.printf("Preço da carga: R$ %.2f%n", precoTotal);
        }
    }
}