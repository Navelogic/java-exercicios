package exe4.Model;

public class Combustivel {
    private double preco;
    private double gastoMedio;
    private double gastoLitrosTotal;
    private double gastoEmReal;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getGastoMedio() {
        return gastoMedio;
    }

    public void setGastoMedio(double gastoMedio) {
        this.gastoMedio = gastoMedio;
    }

    public double getGastoLitrosTotal() {
        return gastoLitrosTotal;
    }

    public void setGastoLitrosTotal(double gastoLitrosTotal) {
        this.gastoLitrosTotal = gastoLitrosTotal;
    }

    public double getGastoEmReal() {
        return gastoEmReal;
    }

    public void setGastoEmReal(double gastoEmReal) {
        this.gastoEmReal = gastoEmReal;
    }

    public double quantiaGasta(int km){
        gastoLitrosTotal = km / gastoMedio;
        return gastoLitrosTotal * preco;
    }
}
