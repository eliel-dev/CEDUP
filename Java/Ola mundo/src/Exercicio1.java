import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Informe 2 numeros");
        int num = leTeclado.nextInt();
        int num2 = leTeclado.nextInt();

        if (num2 > num ) {
            System.out.println("O maior numero é: " + num2);
        }else{
            System.out.println("O maior numero é: " + num);
        }
    }
}
