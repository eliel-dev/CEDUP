import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        int numMaior =0, numMenor=0;

        System.out.println("informe 10 números: ");

        for (int i = 1; i <= 10; i++){
            int num = leTeclado.nextInt();

            if (num < numMenor || numMenor == 0 ){
                numMenor = num;
            } else if (num > numMaior) {
                numMaior = num;
            }
        }
        System.out.println("O maior numero é: "+numMaior);
        System.out.println("O menor numero é: "+numMenor);
    }
}
