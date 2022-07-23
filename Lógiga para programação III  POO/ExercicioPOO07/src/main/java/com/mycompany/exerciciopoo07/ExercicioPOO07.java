package com.mycompany.exerciciopoo07;

//A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
//três informações a seguir como atributos:
//a. um primeiro nome,
//b. um sobrenome
//c. um salário mensal
//Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
//cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
//que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
//instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
//empregado.


public class ExercicioPOO07 {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Diego ", "kleinschmidt", 2300.15 );
        Funcionario func2 = new Funcionario("Mario ", "Souza", 2000.20 );       
        
        System.out.println("salario anual sem aumento: " + func1.getSalarioAnual());
        System.out.println("salario anual sem aumento:  " + func2.getSalarioAnual());
        
        func1.setSalario(func1.getSalario() * 1.10);
        func2.setSalario(func2.getSalario() * 1.10);
        
        System.out.println("salario anual com aumento de 10%:  " + func1.getSalarioAnual());
        System.out.println("salario anual com aumento de 10%:  " + func2.getSalarioAnual());
        
    }
}
