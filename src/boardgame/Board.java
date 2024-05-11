package boardgame;

public class Board {
    
    private int rows; // Número de linhas do tabuleiro
    private int columns; // Número de colunas do tabuleiro
    private Piece [][] pieces; // Matriz de peças para representar o tabuleiro
    
    // Método Construtor com Argumentos
    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1) {
            // Verifica se o número de linhas e colunas é válido
            throw new BoardException("Erro ao criar o tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
        }
        
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns]; // Inicializa a matriz de peças
    }

    // Métodos Getters e Setters
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    // Retorna a peça localizada em uma determinada posição (linha, coluna)
    public Piece piece(int row, int column) {
        if(!positionExists(row, column)) {
            // Verifica se a posição está dentro dos limites do tabuleiro
            throw new BoardException("Posição não está no tabuleiro");
        }
            
        return pieces[row][column];
    }
    
    // Retorna a peça localizada em uma determinada posição (objeto Position)
    public Piece piece(Position position) {
        if(!positionExists(position)) {
            // Verifica se a posição está dentro dos limites do tabuleiro
            throw new BoardException("Posição não está no tabuleiro");
        }
        
        return pieces[position.getRow()][position.getColumn()];
    }
    
    // Coloca uma peça em uma determinada posição
    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)) {
            // Verifica se já há uma peça na posição especificada
            throw new BoardException("Já há uma peça na posição " + position);    
        }
        pieces[position.getRow()][position.getColumn()] = piece; // Coloca a peça na posição
        piece.position = position; // Atualiza a posição da peça
    }
    
    // Verifica se uma posição (linha, coluna) está dentro dos limites do tabuleiro
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    
    // Verifica se uma posição (objeto Position) está dentro dos limites do tabuleiro
    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }
    
    // Verifica se há uma peça em uma determinada posição
    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)) {
            // Verifica se a posição está dentro dos limites do tabuleiro
            throw new BoardException("Posição não está no tabuleiro");
        }
        return piece(position) != null; // Retorna true se houver uma peça na posição, caso contrário, retorna false
    }
}
