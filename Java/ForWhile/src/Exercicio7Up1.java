import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Exercicio7Up1 {

    private static final int SOMAR = 1;
    private static final int SUBTRAIR = 2;
    private static final int SAIR = 3;

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        while (true){
            exibirMenu();
            int opcao = leTeclado.nextInt();

            switch (opcao){
                case SOMAR:
                    executarSoma(leTeclado);
                    break;

                case SUBTRAIR:
                    executarSubtracao(leTeclado);
                    break;

                case SAIR:
                    System.out.println("Fui, valeu!");
                    leTeclado.close();
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida entre 1 e 3.");
            }
            System.out.println();
        }
    }

    private static void exibirMenu() {
        System.out.println(
                "Calculadora CEDUP\n" +
                        "1 - Somar\n" +
                        "2 - Subtrair\n" +
                        "3 - Sair\n"+
                        "Digite uma opção:"
        );
    }

    private static void executarSoma(@NotNull Scanner leTeclado) {
        System.out.println("Digite o primeiro número: ");
        double num1 = leTeclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = leTeclado.nextDouble();
        System.out.println("O resultado da soma é: " +(num1 + num2));
    }

    private static void executarSubtracao(@NotNull Scanner leTeclado) {
        System.out.println("Digite o primeiro número: ");
        double num1 = leTeclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = leTeclado.nextDouble();
        System.out.println("O resultado da subtração é: " +(num1 - num2));
    }
}
