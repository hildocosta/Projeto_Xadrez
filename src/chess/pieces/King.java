package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    
    // Construtor da classe King
    public King(Board board, Color color) {
        super(board, color); // Chama o construtor da superclasse ChessPiece
    }
    
    // Retorna a representação textual da peça
    @Override
    public String toString() {
        return "K"; // Retorna "K" para representar o Rei
    }

    // Calcula os movimentos possíveis para o Rei
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        // Implemente aqui a lógica para calcular os movimentos possíveis do Rei
        return mat;
    }
}
