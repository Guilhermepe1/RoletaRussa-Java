package br.senai.sp.roletaRussa;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russa
 * Data: 17/08/2023
 * Autor: Guilherme Pereira
 * */

public class RoletaRussa {
    public static void main(String[] args) {

        /** Criar variaveis */
        int number;
        int random;
        boolean continuar = true;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Random */
        Random aleatorio = new Random();

        while (continuar) {

            /** Coletar Dados do Usuario */
            System.out.println("---------------------------------------");
            System.out.println(">>>>>>>>>>>>>> Bem-vindo <<<<<<<<<<<<<<");
            System.out.println("----------- TESTE SUA SORTE -----------");
            System.out.print("Digite um número: ");
            number = teclado.nextInt();
            System.out.println("---------------------------------------");

            random = aleatorio.nextInt(10 + 1); // Gera número aleatório de 0 10
            System.out.println(random);

            if (random == number) {
                continuar = false;
            }
        }

        /** Finaliza o programa */
        System.out.println("---------------------------------------");
        System.out.println("Parabéns! Você ganhou!!");
        System.out.println("Seu QI é mais de 300 😬");
    }
}
