package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    
    private Board board; // Tabuleiro do jogo de xadrez
    
    // Construtor Padrão
    public ChessMatch() {
        board = new Board(8, 8); // Inicializa o tabuleiro com as dimensões padrão do xadrez (8x8)
        initialSetup(); // Configuração inicial do jogo
    }

    // Obtém as peças do tabuleiro
    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()]; // Matriz de peças do jogo de xadrez
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrix[i][j] = (ChessPiece) board.piece(i, j); // Converte as peças do tabuleiro para peças de xadrez
            }
        }
        return matrix;
    }

    // Configuração inicial do jogo de xadrez
    private void initialSetup() {
        // Coloca as peças iniciais no tabuleiro
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1)); // Torre branca
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4)); // Rei preto
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4)); // Rei branco
    }
}
