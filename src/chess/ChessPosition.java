package chess;

import boardgame.Position;

public class ChessPosition {
    
    private char column;
    private int row;
    
    // Construtor da classe ChessPosition
    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    // Método para obter a coluna
    public char getColumn() {
        return column;
    }

    // Método para obter a linha
    public int getRow() {
        return row;
    }

    // Converte uma posição de xadrez em uma posição do tabuleiro
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }
    
    // Converte uma posição do tabuleiro em uma posição de xadrez
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }
    
    // Sobrescreve o método toString para representar a posição de xadrez como uma string
    @Override
    public String toString() {
        return "" + column + row;
    }
}
