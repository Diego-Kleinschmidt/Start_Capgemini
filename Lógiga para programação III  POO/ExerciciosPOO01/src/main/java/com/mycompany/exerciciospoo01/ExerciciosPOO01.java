package com.mycompany.exerciciospoo01;

//Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
//todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

import java.util.Date;

public class ExerciciosPOO01 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Diego");
        p1.setDataDeNascimento(new Date(1995, 05, 20));
        p1.setAltura(1.73f);
        
        p1.imprimeDados(p1);
    
    }
}
