import java.util.Random;

public class GeradorDeNumero {

    private Random random;

    public GeradorDeNumero() {
        this.random = new Random();
    }

    /**
     * Gera um número inteiro aleatório entre 0 (inclusive) e max (exclusive).
     *
     * @param max O valor máximo (exclusive) para o número aleatório gerado.
     * @return Um número inteiro aleatório entre 0 (inclusive) e max (exclusive).
     */
    public int gerarNumeroAleatorio(int max) {
        return random.nextInt(max);
    }

    /**
     * Gera um número inteiro aleatório entre min (inclusive) e max (inclusive).
     *
     * @param min O valor mínimo (inclusive) para o número aleatório gerado.
     * @param max O valor máximo (inclusive) para o número aleatório gerado.
     * @return Um número inteiro aleatório entre min (inclusive) e max (inclusive).
     */
    public int gerarNumeroAleatorio(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}