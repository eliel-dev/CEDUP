import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");



        System.out.println("Informe a quantidade de notas que deseja inserir: ");
        int qtd_notas = entrada.nextInt();
        double[] nota = new double[qtd_notas];

        System.out.println("Agora informe as notas:");

        for (int i = 0; i < qtd_notas; i++){
            nota[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < qtd_notas; i++){
            soma += nota[i];
        }

        System.out.println("A media das notas é: " +(df.format(soma/qtd_notas)));
    }
}
