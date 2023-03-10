import java.util.Scanner;

/**Escreva um programa que pergunte ao usuário, por um laço while,
várias notas maiores ou iguais à zero.
Por fim, quando o usuário digitar uma nota negativa, o programa deve mostrar
a média aritmética.*/

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        int i = 0;
        double nota, soma = 0D;

        System.out.println("Informe as notas (Informe uma nota negativa para encerrar)");

        while(true){
            nota = leTeclado.nextDouble();
            if (nota < 0D){
                break;
            }
            soma += nota;
            i++;
        }
        if (i==0){
            System.out.println("Não foi informado uma nota");
        }else {
            double media = soma/i;
            System.out.println("Media das notas:"+media);
        }
        leTeclado.close();
    }
}
