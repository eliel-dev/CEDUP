import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];
        String[] jogadores = new String[2];

        int vezDoJogador = 0;
        int jogadas = 0;

        System.out.println("Bem-vindo ao jogo da velha, desenvolvido por Eliel e Carlos");
        System.out.println("Informe o nome dos jogadores");
        System.out.println("Jogador 1: ");
        jogadores[0] = input.nextLine();
        System.out.println("Jogador 2: ");
        jogadores[1] = input.nextLine();
        System.out.println();

        while (true) {
            System.out.println(jogadores[vezDoJogador] + ", faça sua jogada:");
            System.out.print("Linha: ");
            int linha = input.nextInt();
            System.out.print("Coluna: ");
            int coluna = input.nextInt();

            // Usa "continue" para ignorar o resto do loop e voltar para inicio do while, caso a condição no if" seja true
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Coordenadas inválidas! Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] != 0) {
                System.out.println("Posição já marcada! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = vezDoJogador + 1;

            jogadas++;

            System.out.println("Tabuleiro: ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == 1) {
                        System.out.print("X ");
                    } else if (tabuleiro[i][j] == 2) {
                        System.out.print("O ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            if (verificarVencedor(tabuleiro, vezDoJogador + 1)) {
                System.out.println(jogadores[vezDoJogador] + " ganhou!");
                break;
            }

            if (jogadas == 9) {
                System.out.println("Empate!");
                break;
            }

            vezDoJogador = (vezDoJogador == 0) ? 1 : 0;
        }
    }

    public static boolean verificarVencedor(int[][] tabuleiro, int jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[2][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[0][2] == jogador) {
            return true;
        }
        return false;
    }
}
