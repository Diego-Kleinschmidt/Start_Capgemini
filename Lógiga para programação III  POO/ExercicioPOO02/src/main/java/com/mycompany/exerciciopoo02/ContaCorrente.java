package com.mycompany.exerciciopoo02;

import javax.swing.JOptionPane;

public class ContaCorrente {
    
    private int numeroDaConta;
    private String nomeCorrentista;
    private Double saldo;
    
    public ContaCorrente(String nome, int numConta){
        this.nomeCorrentista = nome;
        this.numeroDaConta = numConta;
        this.saldo = 0.0;
}
    
    public ContaCorrente(String nome, int numConta, Double saldo){
        this.nomeCorrentista = nome;
        this.numeroDaConta = numConta;
        this.saldo = saldo;
}
    
    public void alteraNome (String novoNome){
        setNomeCorrentista(novoNome);
    }
    
    public void deposito (double deposito){
        setSaldo((Double) (getSaldo() + deposito)); 
    }
    
    public void saque (double saque){
        setSaldo((Double) (getSaldo() - saque));
    }
    
    public String mostraDados() {
        String mensagem;
        mensagem = "Numero da conta: " + getNumeroDaConta() + "  Nome do correntista: " + getNomeCorrentista() + "  Saldo em conta: " + getSaldo();
        return mensagem;
}

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
