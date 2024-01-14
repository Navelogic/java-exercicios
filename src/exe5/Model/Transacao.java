package exe5.Model;

import java.util.Date;

public class Transacao {
    private static int contadorIds = 0;

    private int id;
    private boolean isDeposito;
    private double valor;
    private Date data;

    // Construtor
    public Transacao(boolean isDeposito, double valor) {
        this.id = ++contadorIds;
        this.isDeposito = isDeposito;
        this.valor = valor;
        this.data = new Date();
    }

    @Override
    public String toString() {
        return "Transação{" +
                "id=" + id +
                ", isDeposito=" + isDeposito +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
