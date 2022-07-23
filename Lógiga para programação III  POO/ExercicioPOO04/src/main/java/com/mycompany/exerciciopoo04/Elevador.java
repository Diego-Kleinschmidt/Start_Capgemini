package com.mycompany.exerciciopoo04;

import javax.swing.JOptionPane;

public class Elevador {
    public int andarAtual;
    public int totalDeAndares;
    public int capacidade;
    public int pessoasdentro;
    
    public void inicializar(int capacidade,int andares ){
        this.andarAtual = 0;
        this.totalDeAndares = andares;
        this.capacidade = capacidade;
        this.pessoasdentro = 0;
    }
    
    public void entrar(){
        if (pessoasdentro < capacidade){
            this.pessoasdentro += 1;
        }else{
            JOptionPane.showMessageDialog(null,"Elevador cheio");
        }
    }
    
    public void sair(){
        if (pessoasdentro > 0){
            this.pessoasdentro -= 1;
        }else{
            JOptionPane.showMessageDialog(null,"Elevador vazio");
        }
    }
    
    public void sobe (){
        if (andarAtual < totalDeAndares){
            andarAtual += 1;
        }else{
             JOptionPane.showMessageDialog(null,"Elevador no ultimo andar");
        }
    }
    
    public void desce(){
        if(andarAtual > 0){
            andarAtual -= 1;
        }else{
            JOptionPane.showMessageDialog(null,"Elevador no térreo");
        }
    }
    
    public void status(){
        JOptionPane.showMessageDialog(null, "Andar atual: " + andarAtual +"   Total de andares :"+ totalDeAndares + "   pessoas dentro: " + pessoasdentro + "   capasidade: " + capacidade);
    }
}

