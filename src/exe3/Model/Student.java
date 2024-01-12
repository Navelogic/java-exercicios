package exe3.Model;

public class Student {
    private String nome;
    private double primeiroTrimestre;
    private double segundoTrimestre;
    private double terceiroTrimestre;
    private boolean aprovado = false;

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeiroTrimestre() {
        return primeiroTrimestre;
    }

    public void setPrimeiroTrimestre(double primeiroTrimestre) {
        this.primeiroTrimestre = primeiroTrimestre;
    }

    public double getSegundoTrimestre() {
        return segundoTrimestre;
    }

    public void setSegundoTrimestre(double segundoTrimestre) {
        this.segundoTrimestre = segundoTrimestre;
    }

    public double getTerceiroTrimestre() {
        return terceiroTrimestre;
    }

    public void setTerceiroTrimestre(double terceiroTrimestre) {
        this.terceiroTrimestre = terceiroTrimestre;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    // Funções

    public double somatorio(){
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    public double pontosFaltantes(){
        if (somatorio() < 60){
            return 60 - somatorio();
        } else {
            return 0;
        }
    }
}
