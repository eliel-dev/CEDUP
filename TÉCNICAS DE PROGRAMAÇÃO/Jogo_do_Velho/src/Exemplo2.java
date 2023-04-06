import java.util.Scanner;

public class Exemplo2 {
        private int[][] tabu;
        private String[] jogadores;
        private int vezDoJogador;
        private int jogadas;

        public void JogoDaVelha(String jogador1, String jogador2) {
            tabu = new int[3][3];
            jogadores = new String[] {jogador1, jogador2};
            vezDoJogador = 0;
            jogadas = 0;
        }

        public void fazerJogada(int linha, int coluna) {
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Coordenadas inválidas!");
                return;
            }
            if (tabu[linha][coluna] != 0) {
                System.out.println("Posição já marcada!");
                return;
            }
            tabu[linha][coluna] = vezDoJogador + 1;
            jogadas++;
        }

        public boolean verificarVencedor() {
            // código para verificar se alguém ganhou
            // For para verificar cada linha
            for (int i = 0; i < tabu.length; i++) {
                if (tabu[i][0] != 0 && tabu[i][0] == tabu[i][1] && tabu[i][1] == tabu[i][2]) {
                    return true;
                }
            }
            // For para verificar cada coluna
            for (int i = 0; i < tabu.length; i++) {
                if (tabu[0][i] != 0 && tabu[0][i] == tabu[1][i] && tabu[1][i] == tabu[2][i]) {
                    return true;
                }
            }
            // Verificar diagonal principal
            if (tabu[0][0] != 0 && tabu[0][0] == tabu[1][1] && tabu[1][1] == tabu[2][2]) {
                return true;
            }
            // Verificar diagonal secundária
            if (tabu[0][2] != 0 && tabu[0][2] == tabu[1][1] && tabu[1][1] == tabu[2][0]) {
                return true;
            }
            return false;
        }
        
        

        public boolean verificarEmpate() {
            // código para verificar se deu empate
            if (verificarEmpate()) {
                System.out.println("Empate!");
        }

        public void exibirtabu() {
            // código para exibir o tabu
            // ...
        }

        public void jogar() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bem-vindo ao jogo da velha, desenvolvido por Eliel e Carlos");
            System.out.println("Informe o nome dos jogadores");
            System.out.println("Jogador 1 (X): ");
            jogadores[0] = entrada.nextLine();
            System.out.println("Jogador 2 (O): ");
            jogadores[1] = entrada.nextLine();
            System.out.println();

            while (true) {
                System.out.println(jogadores[vezDoJogador] + ", faça sua jogada:");
                System.out.print("Linha: ");
                int linha = entrada.nextInt();
                System.out.print("Coluna: ");
                int coluna = entrada.nextInt();
                fazerJogada(linha, coluna);
                exibirtabu();
                if (verificarVencedor()) {
                    System.out.println(jogadores[vezDoJogador] + " ganhou!");
                    break;
                }
                verificarEmpate();
                }
                vezDoJogador = (vezDoJogador == 0) ? 1 : 0;
            }
        }
    }


