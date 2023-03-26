import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //solicitar a letra
        System.out.println("Informe uma letra minúscula: ");
        String letra = entrada.nextLine();

        //Alteração
        switch (letra.toLowerCase()) {
            case "a","e","i","o","u":
                System.out.println("Essa letra é vogal!");
                break;
            default:
            System.out.print("A sua letra é consoante!");
        }
    }
}
