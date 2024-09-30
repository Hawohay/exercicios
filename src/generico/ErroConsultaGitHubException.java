package generico;

public class ErroConsultaGitHubException extends RuntimeException {
    private String menssage;

    public ErroConsultaGitHubException(String menssage) {
        this.menssage = menssage;
    }

    @Override
    public String getMessage() {
        return this.menssage;
    }
}
