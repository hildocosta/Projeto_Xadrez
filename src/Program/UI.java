package Program;

import chess.ChessPiece;

public class UI {
    
    // Método estático para imprimir o tabuleiro
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            // Imprime o número da linha (invertido, para imprimir na ordem correta)
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]); // Imprime a peça na posição (i, j)
            }
            System.out.println(); // Quebra de linha após cada linha do tabuleiro
        }
        // Imprime a linha com as letras das colunas
        System.out.println("  a b c d e f g h");
    }
    
    // Método privado para imprimir uma peça
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-"); // Se não houver peça, imprime "-"
        } else {
            System.out.print(piece); // Se houver peça, imprime a representação da peça
        }
        System.out.print(" "); // Espaço após cada peça
    }
}
