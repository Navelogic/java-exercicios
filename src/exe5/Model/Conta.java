package exe5.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Conta {
    Banco bc = new Banco();
    private String titular;
    public boolean negativado = false;
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
        bc.totalContasRegistradas = idConta;
    }

    // Função para Depósito
    public void deposito(double deposito){
        totalEmConta += deposito;
        registrarTransacao("Depósito", deposito);
    }

    // Função para Saque
    public void saque(double saque) {
        if (totalEmConta >= saque + 5) {
            totalEmConta -= (saque + 5);
            registrarTransacao("Saque", -saque - 5);
        } else {
            negativado = true;
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Função para registrar transações
    private void registrarTransacao(String tipo, double valor) {
        Transacao transacao = new Transacao(tipo.equals("Depósito"), valor);
        extrato.add(transacao);
    }

    // Exibir extrato
    public void exibirExtrato() {
        System.out.println("--- Extrato ---");
        for (Transacao transacao : extrato) {
            System.out.println(transacao);
        }
        System.out.println("--- Fim do Extrato ---");
    }

    // To String
    @Override
    public String toString() {
        return  bc
                + "\n Titular: " + titular
                + ", Identificação da conta: " + idConta
                + ", Saldo: R$" + String.format("%.2f",totalEmConta);
    }
}
