package generico;

public class SenhaInvalidaException extends RuntimeException {
    private String menssage;

    public SenhaInvalidaException(String menssage) {
        this.menssage = menssage;
    }

    @Override
    public String getMessage() {
        return this.menssage;
    }
}
