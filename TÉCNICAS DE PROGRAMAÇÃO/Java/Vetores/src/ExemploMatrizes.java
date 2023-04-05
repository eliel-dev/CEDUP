//int idade2 = Integer.parseInt("20");

public class ExemploMatrizes {

    public static void main(String[] args) {
        // Matriz
        String[][] pessoas = new String[4][3];
        pessoas[0][0] = "Robert";
        pessoas[0][1] = "Debarba";
        pessoas[0][2] = "20";

        pessoas[1][0] = "Mateus";
        pessoas[1][1] = "Silva";
        pessoas[1][2] = "18";

        pessoas[2][0] = "Amanda";
        pessoas[2][1] = "Sousa";
        pessoas[2][2] = "60";

        pessoas[3][0] = "Mario";
        pessoas[3][1] = "Souza";
        pessoas[3][2] = "30";

        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < pessoas[0].length; j++) {
                System.out.println("i=" + i + " j=" + j + ": " + pessoas[i][j]);
            }
        }

        System.out.println("---------------");

        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < pessoas[0].length; j++) {
                System.out.print(pessoas[i][j] + " \t");
            }
            System.out.println();
        }

        String[][] pessoas2 = {
                {"Robert",     "Debarba",  "20"},
                {"Mateus",      "Silva",    "18"},
                {"Amanda",      "Sousa",    "60"},
                {"Mario",       "Souza",    "30"}
        };
    }
}

