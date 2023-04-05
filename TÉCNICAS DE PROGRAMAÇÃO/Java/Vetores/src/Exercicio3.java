/** Faça um programa que leia várias notas, até o usuário digitar -1, salvando em um vetor.
 * Por fim mostre a média na tela */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("#.##");

        double nota = 0;
        double[] notas = new double[0];

        while (nota != -1){
            System.out.println("Informe as notas: ");
            nota = entrada.nextDouble();

            double[] nota_novo = new double[notas.length +1];
            nota_novo[nota_novo.length - 1] = nota;

            for (int i = 0; i < notas.length; i++){
                nota_novo[i] = notas[i];
            }
            notas = nota_novo;
        }
        double soma = 0;
        for (int i = 0; i < notas.length - 1; i++){
            soma += notas[i];
        }

        System.out.println("A media das notas é: "+(soma/(notas.length - 1)));
    }
}
