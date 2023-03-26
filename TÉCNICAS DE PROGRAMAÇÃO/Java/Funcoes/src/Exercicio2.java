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
import java.util.Scanner;

public class Exercicio2 {
    private static final String usuario_valido ="Eliel";
    private static final String senha_valida ="Teste";

    public static void main(String[] args) {
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
                System.out.println("Informe seu usuario:");
                String user = leTeclado.next();

                System.out.println("Informa a senha: ");
                String senha = leTeclado.next();

                if (loginAdmin(user,senha)) {
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

    // Função que Verifica se a senha e usuario digtado são validos
    public static boolean loginAdmin(String user, String senha) {
        if (user.equalsIgnoreCase(usuario_valido) && senha.equalsIgnoreCase(senha_valida)) {
            return true;
        } else {
            return false;
        }
    }
}