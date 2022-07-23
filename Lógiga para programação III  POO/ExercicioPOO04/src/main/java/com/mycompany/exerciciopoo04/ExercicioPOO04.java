package com.mycompany.exerciciopoo04;

//Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
//prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
//térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
//disponibilizar os seguintes métodos:
//a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
//prédio (os elevadores sempre começam no térreo e vazio);
//b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
//e. Desce: para descer um andar (não deve descer se já estiver no térreo);

public class ExercicioPOO04 {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializar(4, 4);
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.sobe();
        elevador.sobe();

        elevador.status();

    }
}
