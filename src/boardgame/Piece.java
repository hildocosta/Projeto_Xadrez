package boardgame;

public class Piece {
	
	protected Position position; 
	private Board board;
	
	
	
	// Metodo Construtor com Argumentos
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	

	// Metodo Getters e Setters
	protected Board getBoard() {
		return board;
	}


	
	
	
	
	

}
