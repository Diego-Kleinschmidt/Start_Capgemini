package com.mycompany.exerciciopoo03;

//Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
//atributos a classes deve conter os seguintes métodos.
//a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no veículo
//b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
//valor a ser pago pelo cliente.
//c. alterarValor; //altera o valor do litro do combustível.
//d. alterarCombustivel; //altera o tipo do combustível.
//e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.

public class ExercicioPOO03 {
    
    public static void main(String[] args) {
        BombaCombustivel bico1 = new BombaCombustivel("Gasolina Aditivada", 5.80, 10000.0);
        BombaCombustivel bico2 = new BombaCombustivel("Gasolina Comum", 5.72, 10000.0);
        
        bico1.abastecerPorLitros(25.0);
        bico1.abatecerPorValor(132.0);
        bico1.informacaoDaBomba();
        
        bico2.alteraCombustivel("Diesel");
        bico2.alteraValor(7.45);
        bico2.alteraQuantdadeCombustivel(5000.00);
        bico2.abastecerPorLitros(1000.0);
        bico2.abatecerPorValor(300.00);
        bico2.informacaoDaBomba();
        
    }
}
