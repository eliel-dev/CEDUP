import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[][] pessoas = new String[5][2];


        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Informe seu nome: ");
            pessoas [i][0] = entrada.nextLine();
            System.out.println("inform a Idade: ");
            pessoas [i][1] = entrada.nextLine();
        }


        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < pessoas[0].length; j++) {
                System.out.print(pessoas[i][j] + " \t");
            }
            System.out.println();
        }
    }
}

