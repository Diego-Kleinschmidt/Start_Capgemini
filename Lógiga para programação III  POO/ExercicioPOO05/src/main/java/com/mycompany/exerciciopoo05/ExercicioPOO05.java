package com.mycompany.exerciciopoo05;

//Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
//classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
//Escreva os seguintes métodos para esta classe:
//a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

import javax.swing.JOptionPane;

public class ExercicioPOO05 {

    public static void main(String[] args) {
        Alunos matematica = new Alunos("Diego", 45885, 8.4, 6.9, 7.5);

        JOptionPane.showMessageDialog(null, "O aluno " + matematica.nome + " precisar tirar " + matematica.notaFinal() + " na prova final");
    }
}
