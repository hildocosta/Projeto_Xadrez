package chess;

public class ChessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de exceção
    public ChessException(String msg) {
        super(msg); // Chama o construtor da superclasse RuntimeException com a mensagem fornecida
    }
}
