
package boardgame;

public abstract class Piece {
    
    protected Position position; // Posição da peça no tabuleiro
    private Board board; // Referência ao tabuleiro onde a peça está
    
    // Método Construtor com Argumentos
    public Piece(Board board) {
        this.board = board; // Define o tabuleiro da peça
        position = null; // Inicialmente, a peça não possui posição
    }
    
    // Métodos Getters e Setters
    protected Board getBoard() {
        return board; // Retorna o tabuleiro da peça
    }
    
    public abstract boolean [][] possibleMoves();
    
    public boolean possibleMove(Position postion) {
    	return possibleMoves()[position.getRow()][position.getColumn()];
    }
    
    
    public boolean isThereAnyPossibleMove() {
    	boolean[][] mat = possibleMoves();
    	for (int i=0; i < mat.length; i++) {
    		for (int j=0; j < mat.length; j++) {
    			if (mat[i][j]) {
    				return true;
    			}
    		}
    	}
    	return false;
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
}
