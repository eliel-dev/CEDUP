import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            imprimirMenu();
            opcao = leTeclado.nextInt();

            if(opcao==1){
                //somar
                int n1 = solicitarNum("Digite o numero 1: ");
                int n2 = solicitarNum("Digite o numero 2: ");

                int resultadoSoma = somar(n1,n2);
                System.out.println("Resultado: " + resultadoSoma);

            }
            if(opcao==2) {
                //subtrair
                int n1 = solicitarNum("Digite o numero 1: ");
                int n2 = solicitarNum("Digite o numero 2: ");

                int resultadoSub = subtrair(n1,n2);
                System.out.println("Resultado: " + resultadoSub);
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

    public static int somar (int numero1 , int numero2){
        return numero1 + numero2;
    }

    public static int subtrair (int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int solicitarNum(String pergunta) {
        System.out.println(pergunta);
        Scanner leTeclado = new Scanner(System.in);

        return leTeclado.nextInt();

    }
}
