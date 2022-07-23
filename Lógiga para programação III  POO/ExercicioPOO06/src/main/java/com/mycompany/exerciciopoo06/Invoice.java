package com.mycompany.exerciciopoo06;

public class Invoice {

    private int numeroItem;
    private String descricaoItem;
    private int quantidadeItem;
    private double precoUnitarioItem;

    public Invoice(int numeroItem, String descricaoItem, int quantidadeItem, double precoUnitarioItem) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (quantidadeItem < 0) {
            this.quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
        if (precoUnitarioItem < 0) {
            this.precoUnitarioItem = 0.0;
        } else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    public Double getInvoiceAmount() {
        return getQuantidadeItem() * getPrecoUnitarioItem();
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

}
