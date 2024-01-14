package exe5.Model;

public class Banco {
    private static final String NOME_BANCO = "Unicesumar Bank for Students";
    private static final int AGENCIA = 147;
    public int totalContasRegistradas = 0;

    // Getters e Setters
    public int getTotalContasRegistradas() {
        return totalContasRegistradas;
    }

    public void incrementarContasRegistradas() {
        totalContasRegistradas++;
    }

    // To String
    @Override
    public String toString() {
        return NOME_BANCO + "\n Agência: " + AGENCIA;
    }
}
