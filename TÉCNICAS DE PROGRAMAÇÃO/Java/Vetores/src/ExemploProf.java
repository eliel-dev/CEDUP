public class ExemploProf {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] = 10;
        idades[1] = 30;
        idades[2] = 20;
        idades[3] = 26;
        idades[4] = 28;

        // Outra opção para declarar um array int
        int[] idades2 = {10, 30, 20, 26};

        String[] nomes = new String[3];

        // Outra opção para declarar um array String
        String[] nomes2 = {null, null, null};

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
