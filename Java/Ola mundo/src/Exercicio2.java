import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Informe suas 3 notas ");
        int nota = leTeclado.nextInt();
        int nota2 = leTeclado.nextInt();
        int nota3 = leTeclado.nextInt();

        int media = ((nota + nota2 + nota3) / 3);

        if (media == 10) {
            System.out.println("Aprovado com distinção! ");
        }else if(media < 7){
            System.out.println("Reprovado");
        }else if ( media >=7 || media <=9){
            System.out.println("Aprovado");
        }
    }
}
