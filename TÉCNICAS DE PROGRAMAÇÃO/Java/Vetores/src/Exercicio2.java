import java.util.Scanner;

/** 2. Faça um Programa que leia a quantidade de notas, em seguida as notas conforme quantidade informada salvando em um vetor e por fim mostre a média na tela.*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] nota = new int[999];
        double soma = 0;
        int j = 0;

        System.out.println("Informe a quantidade de notas que deseja inserir: ");
        int qtd_notas = entrada.nextInt();

        System.out.println("Agora informe as notas:");

        for(int i = 0; i < qtd_notas; i++){
            nota[i] = entrada.nextInt();
            soma += nota[i];
            j ++;
        }

        System.out.println("A media das notas é: " +(soma/j));
    }
}
