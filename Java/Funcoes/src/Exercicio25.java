import java.io.Console;
import java.util.Arrays;

public class Exercicio25 {

    private static final int OPCAO_ENTRAR = 1;
    private static final int OPCAO_SAIR = 2;
    private static final String USUARIO_CORRETO = "Eliel";
    private static final char[] SENHA_CORRETA = {'t', 'e', 's', 't', 'e'};

    private static final Console console = System.console();

    public static void main(String[] args) {
        imprimirMenu();
    }

    public static void imprimirMenu() {
        System.out.println("Sistema CEDUP");
        System.out.println(OPCAO_ENTRAR + " - Entrar");
        System.out.println(OPCAO_SAIR + " - Sair");

        int opcao = Integer.parseInt(console.readLine());

        switch (opcao) {
            case OPCAO_ENTRAR:
                if (loginAdmin()) {
                    System.out.println("Bem-vindo");
                } else {
                    System.out.println("Login inválido, tente novamente");
                }
                break;
            case OPCAO_SAIR:
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
    }

    public static boolean loginAdmin() {
        String user = txtRetornaTxt("Informe seu usuario: ");
        char[] senha = console.readPassword("Informa a senha: ");

        return user.equalsIgnoreCase(USUARIO_CORRETO) && Arrays.equals(senha, SENHA_CORRETA);
    }
}
