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

        System.out.println(
            "Calculadora CEDUP\n" +
            "1 - Somar\n" +
            "2 - Subtrair\n" +
            "3 - Sair"
        );

        int opcao = leTeclado.nextInt();
        while (opcao != 3){
            System.out.println("ola mundo");
            break;
        }




    }
}
