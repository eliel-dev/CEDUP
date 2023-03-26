import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("informe no formato numérico, o mes do qual deseja saber quantos dias tem: ");
        int mes = leTeclado.nextInt();

        switch (mes){
            case 2:
                System.out.println("Esse mes tem 28 dias");
                break;
            case 4,6,9,11:
                System.out.println("Esse mes tem 30 dias");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("Esse mes tem 31 dias");
                break;
            default:
                System.out.println("Numero inválido");
        }
    }
}
