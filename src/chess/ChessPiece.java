package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
    
    private Color color; // Cor da peça de xadrez
    
    // Construtor com Argumentos
    public ChessPiece(Board board, Color color) {
        super(board); // Chama o construtor da superclasse Piece
        this.color = color; // Define a cor da peça
    }

    // Método Getter para a cor da peça
    public Color getColor() {
        return color; // Retorna a cor da peça
    }
}
