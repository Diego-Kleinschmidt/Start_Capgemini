package com.mycompany.exerciciopoo05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Alunos {

    public int matricula;
    public String nome;
    public Double prova1;
    public Double prova2;
    public Double trabalho;
    
    public Alunos(String nome, int matricula,Double prova1,Double prova2,Double trabalho ){
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public Double media() {
        double media = ((2.5 * prova1) + (2.5 * prova2) + (2 * trabalho)) / 7 ;
        return media;
    }

    public String notaFinal() {
        NumberFormat formatar = new DecimalFormat("#0.00");
        double nota = 0.0;
        if (media() < 7) {
            nota = 7 - media();
        }
        return formatar.format(nota);
    }
}
