package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    
    // Construtor com Argumentos
    public King(Board board, Color color) {
        super(board, color); // Chama o construtor da superclasse ChessPiece
    }
    
    // Representação textual da peça
    @Override
    public String toString() {
        return "K"; // Retorna "K" para representar o Rei
    }

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
