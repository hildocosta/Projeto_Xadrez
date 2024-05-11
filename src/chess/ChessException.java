package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de exceção
    public ChessException(String msg) {
        super(msg); // Chama o construtor da superclasse RuntimeException com a mensagem fornecida
    }
}
