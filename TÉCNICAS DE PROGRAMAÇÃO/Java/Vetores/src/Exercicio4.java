/** 4. Faça um programa que leia o nome e a idade de 5 pessoas e salve-os em uma matriz.
 * Por fim mostre a média das idades. */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // Le as entradas digitadas pelo user
        Scanner entrada = new Scanner(System.in);

        //Matriz de 5 linhas e 2 colunas
        String[][] pessoas = new String[5][2];

        //Loop para preencher os nomes e idades informadas pelo user
        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Informe seu nome: ");
            pessoas [i][0] = entrada.nextLine();
            System.out.println("inform a Idade: ");
            pessoas [i][1] = entrada.nextLine();
            System.out.println();
        }

        //Variaveis para armazenar a soma das idades e a média
        int somaIdades = 0;
        double mediaIdades;

        for (int i = 0; i < pessoas.length; i++) {
            int idade_Int = Integer.parseInt(pessoas[i][1]);
            somaIdades += idade_Int;
        }

        mediaIdades = (double) somaIdades / pessoas.length;

        System.out.println("A média das idades é: " + mediaIdades);

    }
}

