import java.util.Scanner;

/**7. Escreva um programa imprima o seguinte menu com 3 funcionalidades de
        calculadora:
        ''''''''''''''''''''''
        Calculadora CEDUP
        1 - Somar
        2 - Subtrair
        3 - Sair
        ''''''''''''''''''''''
        O programa deve exibir o menu novamente para qualquer opção escolhida,
        exceto para a opção 3, que finaliza a execução.*/
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        while (true){
            System.out.println(
                    "Calculadora CEDUP\n" +
                     "1 - Somar\n" +
                     "2 - Subtrair\n" +
                     "3 - Sair"
            );
            int opcao = leTeclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    double num1 = leTeclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    double num2 = leTeclado.nextDouble();
                    System.out.println("O resultado da soma é: " +(num1 + num2));
                    break;

                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    double num3 = leTeclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    double num4 = leTeclado.nextDouble();
                    System.out.println("O resultado da soma é: " +(num3 - num4));
                    break;

                case 3:
                    System.out.println("Fui, valeu!");
                    return;

                default:
                    System.out.println("Opção Inválida!");
            }
        }




    }
}
