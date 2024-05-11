package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    
    private Board board; // Tabuleiro do jogo de xadrez
    
    // Construtor Padrão
    public ChessMatch() {
        board = new Board(8, 8); // Inicializa o tabuleiro com as dimensões padrão do xadrez (8x8)
        initialSetup(); // Configuração inicial do jogo
    }

    // Obtém as peças do tabuleiro
    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()]; // Matriz de peças do jogo de xadrez
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrix[i][j] = (ChessPiece) board.piece(i, j); // Converte as peças do tabuleiro para peças de xadrez
            }
        }
        return matrix;
    }
    
    
    // Executa um movimento de xadrez
    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }
    
    
    // Realiza um movimento no tabuleiro
    private Piece makeMove(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }
    
    
    // Valida a posição de origem do movimento
    public void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException(" There is no piece source position");
        }
        if (!board.piece(position).isThereAnyPossibleMove()) {
        	throw new ChessException("There is no possible moves for the chosen piece");
        }
    }
    
    // Método privado para colocar uma nova peça no tabuleiro
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        // Converte a posição de xadrez para uma posição no tabuleiro e coloca a peça
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    // Configuração inicial do jogo de xadrez
    private void initialSetup() {
        // Coloca as peças iniciais no tabuleiro
        placeNewPiece('c', 1, new Rook(board, Color.WHITE)); // Torre branca
        placeNewPiece('c', 2, new Rook(board, Color.WHITE)); // Torre branca
        placeNewPiece('d', 2, new Rook(board, Color.WHITE)); // Torre branca
        placeNewPiece('e', 2, new Rook(board, Color.WHITE)); // Torre branca
        placeNewPiece('e', 1, new Rook(board, Color.WHITE)); // Torre branca
        placeNewPiece('d', 1, new King(board, Color.WHITE)); // Rei branco

        placeNewPiece('c', 7, new Rook(board, Color.BLACK)); // Torre preta
        placeNewPiece('c', 8, new Rook(board, Color.BLACK)); // Torre preta
        placeNewPiece('d', 7, new Rook(board, Color.BLACK)); // Torre preta
        placeNewPiece('e', 7, new Rook(board, Color.BLACK)); // Torre preta
        placeNewPiece('e', 8, new Rook(board, Color.BLACK)); // Torre preta
        placeNewPiece('d', 8, new King(board, Color.BLACK)); // Rei preto
    }
}
