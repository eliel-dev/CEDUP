import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Mateus");
        nomes.add("Ricardo");

        // Imprime a lista
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------");

        // Remove o Roberto
        nomes.remove("Roberto");

        // Imprime a lista
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes.contains("Roberto"));
        System.out.println(nomes.indexOf("Ricardo"));
        System.out.println(nomes.size());

        // Substituir ou alterar um item
        int indice = nomes.indexOf("Ricardo");
        nomes.set(indice, "Ricardo Silva");

        // Imprime a lista
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // Exemplo com Integer
        List<Integer> idades = new ArrayList<>();
        idades.add(10);
        idades.add(20);

        // Imprime a lista
        for (int i = 0; i < idades.size(); i++) {
            System.out.println(idades.get(i));
        }

        // Lista de vetores

        List<String[]> nomesIdades = new ArrayList<>();
        String[] roberto = { "Roberto", "30" };
        nomesIdades.add(roberto);
        String[] maria = { "Maria", "40" };
        nomesIdades.add(maria);

        String[] linhaDaMaria = nomesIdades.get(1);
        String idade = linhaDaMaria[1];
    }
}



//6. Faça um Programa que leia 5 números, salve em uma lista e mostre-os.
//7. Faça um Programa que leia várias notas, até o usuário digitar -1, salvando em uma lista. 
//Por fim mostre a média na tela.
//8. Faça um programa que leia o nome e a idade de 5 pessoas e salve-os em uma lista. 
//Por fim mostre a média das idades.