package com.mycompany.exerciciospoo01;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private Date dataDeNascimento;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimeDados(Pessoa p) {
        JOptionPane.showMessageDialog(null, "seu nome é " + p.nome + " sua idade é " + calculaIdade() + " sua altura é " + p.altura);
    }

    public int calculaIdade() {
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataDeNascimento.getYear();
        //mês começa no 0 por isso  +1  aki
        if (((hoje.get(Calendar.MONTH) + 1) < dataDeNascimento.getMonth())) {
            idade--;
        } else if ((hoje.get(Calendar.DAY_OF_MONTH) < dataDeNascimento.getDate())) {
            idade--;
        }

        return idade;
    }

}
