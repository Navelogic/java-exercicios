package exe5.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Conta {
    Banco bc = new Banco();
    private String titular;
    private int idConta;
    private double totalEmConta = 0;
    private ArrayList<Transacao> extrato = new ArrayList<>();
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Construtor de Conta sem Depósito
    public Conta(String titular){
        funcaoID();
        this.titular = titular;
    }

    // Construtor de Conta com Depósito
    public Conta(String titular, double deposito){
        funcaoID();
        this.titular = titular;
        this.totalEmConta = deposito;
    }

    // Getters e Setters
    public Banco getBc() {
        return bc;
    }

    public void setBc(Banco bc) {
        this.bc = bc;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getTotalEmConta() {
        return totalEmConta;
    }

    public void setTotalEmConta(double totalEmConta) {
        this.totalEmConta = totalEmConta;
    }

    public ArrayList<Transacao> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<Transacao> extrato) {
        this.extrato = extrato;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Função para ID
    private void funcaoID(){
        idConta = bc.getTotalContasRegistradas() + 1;
        bc.setTotalContasRegistradas(idConta);
    }

    // Função para Depósito
    public void deposito(double deposito){
        totalEmConta = totalEmConta + deposito;
    }
    // Função para Saque
    public void saque(double saque){
        totalEmConta = totalEmConta - saque - 5;
    }

    //To String
    @Override
    public String toString() {
        return  bc
                + "\n Titular: " + titular
                + ", Saldo: R$" + String.format("%.2f",totalEmConta);
    }
}
