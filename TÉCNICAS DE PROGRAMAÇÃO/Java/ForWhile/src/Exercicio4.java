import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Qual o tamanho de quadrado quer fazer?");
        int tamanho = leTeclado.nextInt();

        for (int linha = 1; linha <= tamanho ; linha++){
            for (int coluna = 1; coluna <= tamanho ; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
