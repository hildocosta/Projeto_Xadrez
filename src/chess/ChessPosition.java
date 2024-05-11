package chess;

import boardgame.Position;

public class ChessPosition {
    
    private char column; // Coluna da posição no formato de letra (a-h)
    private int row; // Linha da posição
    
    // Construtor que verifica se os valores fornecidos são válidos
    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            // Lança uma ChessException se os valores fornecidos não estiverem dentro do intervalo permitido
            throw new ChessException("Erro ao instanciar ChessPosition. Os valores válidos estão entre a1 e h8.");
        }
        
        this.column = column; // Define a coluna
        this.row = row; // Define a linha
    }
    
    // Método Getter para a coluna
    public char getColumn() {
        return column; // Retorna a coluna
    }
    
    // Método Getter para a linha
    public int getRow() {
        return row; // Retorna a linha
    }
    
    // Converte a posição de xadrez para uma posição no tabuleiro (classe Position)
    protected Position toPosition() {
        return new Position(8 - row, column - 'a'); // Retorna uma nova posição convertida
    }
    
    // Converte uma posição no tabuleiro (classe Position) para uma posição de xadrez
    protected static ChessPosition fromPosition(Position position) {
        // Converte a linha e a coluna da posição para os valores correspondentes em xadrez
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }
    
    // Representação textual da posição de xadrez (no formato "coluna + linha")
    @Override
    public String toString() {
        return "" + column + row; // Retorna uma string no formato "coluna + linha"
    }
}
