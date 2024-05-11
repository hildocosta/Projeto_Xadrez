package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    
    // Construtor com Argumentos
    public Rook(Board board, Color color) {
        super(board, color); // Chama o construtor da superclasse ChessPiece
    }
    
    // Representação textual da peça
    @Override
    public String toString() {
        return "R"; // Retorna "R" para representar a Torre
    }
    
    @Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
