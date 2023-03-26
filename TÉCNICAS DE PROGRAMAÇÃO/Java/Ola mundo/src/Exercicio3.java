import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Informe seu sexo, M ou F: ");
        String sexo = leTeclado.nextLine();
        System.out.println("Informe sua altura: ");
        double altura = leTeclado.nextDouble();
        leTeclado.nextLine();

        double imcM = (72.7 * altura) - 58;
        String imcMformatado = df.format(imcM);
        double imcF = (62.1 * altura) - 44.7;
        String imcFformatado = df.format(imcF);


        if (sexo.equalsIgnoreCase("F")){
            System.out.println("O peso ideal para uma mulher com a altura de "+altura+" metros, é de " +imcFformatado+" kg");
        }else if(sexo.equalsIgnoreCase("M")){
            System.out.println("O peso ideal para um homem com a altura de "+altura+" metros, é de " +imcMformatado+" kg");
        }else{
            System.out.println("Opção Inválida");
        }
    }
}
