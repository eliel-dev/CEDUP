/** 2. Escreva um programa que imprima o seguinte menu:
 ''''''''''''''''''''''
 Sistema CEDUP
 1 - Entrar
 2 - Sair
 ''''''''''''''''''''''
 Na funcionalidade 1 o sistema deve solicitar o usuário e senha:
 - Caso for correto (pré-determinado), deve exibir uma mensagem de boas vindas.
 - Caso for incorreto, deve exibir uma mensagem de falha e sair do programa.
 Na funciondalidade 2 deve sair do sistema.

 O código deve possuir:
 - Um PROCEDIMENTO para exibir o menu
 - Uma FUNÇÃO para realizar o login, recebendo o usuário e senha por parâmetro
 e retornando o resultado como boolean.*/
import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2part2 {
    public static final String usuario_valido = "Eliel";
    private static final char[] senha_valida = {'t', 'e', 's', 't', 'e'};

    private static final Console console = System.console();

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        imprimirMenu ();

    }

    public static void imprimirMenu (){
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Sistema CEDUP");
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");

        int opcao = leTeclado.nextInt();

        switch (opcao) {
            case 1:
                if (loginAdmin()) {
                    System.out.println("Bem-vindo");
                } else {
                    System.out.println("Login inválido, tente novamente");
                }
                break;
            case 2:
                System.out.println("adeus");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static String txtRetornaTxt(String pergunta) {
        System.out.println(pergunta);
        return console.readLine();

        //return leTeclado.next();
    }

    public static boolean loginAdmin() {

        String user = txtRetornaTxt("Informe seu usuario: ");
        char [] senha = console.readPassword("Informa a senha: ");

        return user.equalsIgnoreCase(usuario_valido) && Arrays.equals(senha, senha_valida);
    }
}