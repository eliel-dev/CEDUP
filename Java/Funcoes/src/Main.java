import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            imprimirMenu();
            opcao = leTeclado.nextInt();

            if(opcao==1){
                //somar
                System.out.println("Digite o primeiro número");
                int n1 = leTeclado.nextInt();
                System.out.println("Digite o segundo número");
                int n2 = leTeclado.nextInt();
                somar (n1,n2);
            }
            if(opcao==2) {
                //subtrair
                System.out.println("Digite o primeiro valor:");
                int n1 = leTeclado.nextInt();
                System.out.println("Digite o segundo valor:");
                int n2 = leTeclado.nextInt();
                subtrair(n1,n2);
            }
        }
        exibirMensagemSaida();
    }
    // Sub rotina - procedimento
    public static void imprimirMenu (){
        System.out.println("Calculadora CEDUP");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Sair");

    }
    // Sub rotina - procedimento
    public static void exibirMensagemSaida(){
        System.out.println("Saindo...");
    }

    public static void somar (int numero1 , int numero2){
        System.out.println("Resultado:" + (numero1 + numero2));
    }

    public static void subtrair (int numero3, int numero4){
        System.out.println("Resultado: " + (numero3 - numero4));
    }


}