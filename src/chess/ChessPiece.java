package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    // Construtor da classe ChessPiece
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // Método para obter a cor da peça
    public Color getColor() {
        return color;
    }
    
    // Verifica se há uma peça oponente em uma posição específica
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
