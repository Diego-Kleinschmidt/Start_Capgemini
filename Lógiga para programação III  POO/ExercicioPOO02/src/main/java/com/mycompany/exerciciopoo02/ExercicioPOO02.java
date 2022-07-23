package com.mycompany.exerciciopoo02;

//Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
//saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.

import javax.swing.JOptionPane;

public class ExercicioPOO02 {

    public static void main(String[] args) {
        ContaCorrente novaconta = new ContaCorrente("Diego", 1452854, 100000.0);
        novaconta.deposito(25500.97);
        novaconta.saque(5200.32);
        novaconta.alteraNome("Diego Henrique Kleinschmidt");
        JOptionPane.showMessageDialog(null, novaconta.mostraDados());

    }
}
