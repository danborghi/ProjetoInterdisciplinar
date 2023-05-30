package com.company;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um calor inteiro e positivo");
        tamanho = scanner.nextInt();

        //Verificando o vlaor lido é realmente inteiro e positivo
        while(tamanho < 0){
            System.out.println("O valor informado não é positivo");
            System.out.println("Informe um valor inteiro e positivo");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um valor para ser inserido na posição " + i + " do meu vetor:");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println("vetor[" + i + "]");
        }
    }
}
