package com.mycompany.exerciciopoo03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public  class BombaCombustivel {
    private String tipoDeCombustivel;
    private Double valorPorLitro;
    private Double quntidadeDeComnustivel;
    
    public BombaCombustivel(String tipo, Double valorLitro, Double quant){
        this.tipoDeCombustivel = tipo;
        this.valorPorLitro = valorLitro;
        this.quntidadeDeComnustivel = quant;
    }
    
    public void informacaoDaBomba(){
        NumberFormat formatar = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, getTipoDeCombustivel() + " valor por litro " + getValorPorLitro() + " quantidade de estoque " + formatar.format(getQuntidadeDeComnustivel()));
    }
    
    public void abatecerPorValor(Double valor){
        double litros = valor / getValorPorLitro();
        this.setQuntidadeDeComnustivel(this.getQuntidadeDeComnustivel() - litros);
        NumberFormat formatar = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "Foi abastecido " + formatar.format(litros) + " litros");
    }
    
    public void abastecerPorLitros (Double litros){
        double valorAhPagar = litros * getValorPorLitro();
        this.setQuntidadeDeComnustivel((Double) (this.getQuntidadeDeComnustivel() - litros));
        JOptionPane.showMessageDialog(null, "O valor a ser pago é " + valorAhPagar);
    }
    
    public void alteraValor (Double novoValor){
        this.setValorPorLitro(novoValor);
    }
    
    public void alteraCombustivel (String novoCombustivel){
        this.setTipoDeCombustivel(novoCombustivel);
    }
    
    public void alteraQuantdadeCombustivel ( Double quant){
        this.setQuntidadeDeComnustivel(quant);
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(Double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public Double getQuntidadeDeComnustivel() {
        return quntidadeDeComnustivel;
    }

    public void setQuntidadeDeComnustivel(Double quntidadeDeComnustivel) {
        this.quntidadeDeComnustivel = quntidadeDeComnustivel;
    }
    
}
