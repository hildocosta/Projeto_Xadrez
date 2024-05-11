package boardgame;

public class BoardException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    // Método Construtor para passar a mensagem de exceção
    public BoardException(String msg) {
        super(msg);
    }

}