import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double totaln = 0;
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Quantos alunos possui em sua classe? ");
        int aluno = leTeclado.nextInt();

        for (int i = 1; i <= aluno; i++){
            System.out.println("informe a nota do "+i+"º aluno: ");
            double notas = leTeclado.nextDouble();
            totaln = totaln + notas;
        }
        double media = totaln/aluno;
        System.out.println(media);
    }
}
