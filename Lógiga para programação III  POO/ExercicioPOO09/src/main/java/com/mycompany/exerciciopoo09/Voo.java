
package com.mycompany.exerciciopoo09;

public class Voo {
    public int numeroVoo;
    public Data diaDoVoo;
    public int maximoPassageiros;
    public int passageirosAbordo;
    
    public Voo(int numerovoo,int ano, int mes, int dia){
        this.numeroVoo = numerovoo;
        this.diaDoVoo = new Data(ano, mes, dia) ;
        this.maximoPassageiros = 100;
        this.passageirosAbordo = 0;
    }
    
    public int proximoLivre(){
        return this.passageirosAbordo++;
    }
    
}
