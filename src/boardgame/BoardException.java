package boardgame;

public class BoardException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    // Construtor da classe BoardException
    public BoardException(String msg) {
        super(msg);
    }
}
