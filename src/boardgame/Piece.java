package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;
    
    // Construtor da classe Piece
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // Método para obter o tabuleiro associado à peça
    protected Board getBoard() {
        return board;
    }
    
    // Método abstrato para calcular os movimentos possíveis da peça
    public abstract boolean[][] possibleMoves();
    
    // Verifica se um determinado movimento é possível para a peça
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    
    // Verifica se há algum movimento possível para a peça
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
