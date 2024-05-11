package boardgame;

public class Position {
    
    private int row; // Linha da posição
    private int column; // Coluna da posição
    
    // Método Construtor com Argumentos
    public Position(int row, int column) {
        this.row = row; // Inicializa a linha
        this.column = column; // Inicializa a coluna
    }

    // Métodos Getters e Setters
    public int getRow() {
        return row; // Retorna a linha
    }

    public void setRow(int row) {
        this.row = row; // Define a linha
    }

    public int getColumn() {
        return column; // Retorna a coluna
    }

    public void setColumn(int column) {
        this.column = column; // Define a coluna
    }
    
    // Método toString para representação textual da posição
    @Override
    public String toString() {
        return row  + ", "  + column; // Retorna uma string no formato "linha, coluna"
    }
}
