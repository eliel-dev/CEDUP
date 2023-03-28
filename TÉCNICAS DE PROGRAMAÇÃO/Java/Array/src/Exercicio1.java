import java.util.Scanner;

/** 1. Faça um Programa que leia 5 números, salve em um vetor de inteiros e mostre-os*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Informe 5 numeros");
        for(int i = 0; i < num.length; i++){
            num[i] = entrada.nextInt();
        }

        System.out.println();
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
