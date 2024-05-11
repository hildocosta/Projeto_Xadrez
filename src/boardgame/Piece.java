package boardgame;

public class Piece {
    
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
}
