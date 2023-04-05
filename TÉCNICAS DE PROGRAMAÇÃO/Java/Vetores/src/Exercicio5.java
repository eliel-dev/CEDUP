import java.util.Scanner;

/** 5. Faça um programa que leia o nome e a idade de 5 pessoas e salve-os em uma matriz.
//Por fim peça um nome e mostre a idade da pessoa com o nome informado.*/

public class Exercicio5 {
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

        //Loop que altera String idade para Int idade_Int
        System.out.println("A idade de quem deseja saber?");
        String pessoa_info = entrada.nextLine();

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i][0].equals(pessoa_info)){
                System.out.println("Idade: " + pessoas[i][1]);
            }
        }
    }
}
