package boardgame;

public class Position {

    private int row;
    private int column;
    
    // Construtor da classe Position
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // Método para obter o número da linha
    public int getRow() {
        return row;
    }

    // Método para definir o número da linha
    public void setRow(int row) {
        this.row = row;
    }

    // Método para obter o número da coluna
    public int getColumn() {
        return column;
    }

    // Método para definir o número da coluna
    public void setColumn(int column) {
        this.column = column;
    }
    
    // Define os valores da posição
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    // Sobrescreve o método toString para representar a posição como uma string
    @Override
    public String toString() {
        return row + ", " + column;
    }
}
