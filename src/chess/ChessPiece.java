package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	
	// Metodo Construtor com Argumentos	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}


	// Metodo Getters e Setters
	public Color getColor() {
		return color;
	}


	
	
	

}
