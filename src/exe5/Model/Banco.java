package exe5.Model;

public class Banco {
    private static final String NOME_BANCO = "Unicesumar Bank for Students";
    private int totalContasRegistradas = 0;

    // Getters e Setters
    public int getTotalContasRegistradas() {
        return totalContasRegistradas;
    }
    public void setTotalContasRegistradas(int totalContasRegistradas) {
        this.totalContasRegistradas = totalContasRegistradas;
    }

    // To String
    @Override
    public String toString() {
        int AGENCIA = 147;
        return NOME_BANCO + "\n Agência: " + AGENCIA;
    }
}
