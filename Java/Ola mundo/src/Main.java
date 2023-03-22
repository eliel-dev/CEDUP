import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        //nome
        System.out.print("Digite seu nome: ");
        String nome = leTeclado.nextLine(); // leia

        System.out.println("Olá " + nome); // escreva

        //idade
        System.out.print("Qual sua idade? ");
        int idade = leTeclado.nextInt(); // leia


        // Se menos de 30 é bebe, se mais de 30 é velho
        if (idade >= 30) {
            System.out.println("Bem vindo, velho"); // escreva
        } else {
            System.out.println("Bem vindo, bebe"); // escreva
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println("O programa vai se encerrar em: " + i);
        }
        System.out.println("Mentira");

        System.out.println("Em qual ano estamos? ");
        int ano = leTeclado.nextInt(); // leia

        while (ano != 2023) {
            System.out.println("Voce acertou!");
        }{
            System.out.println("Tente novamente");
        }
    }
}