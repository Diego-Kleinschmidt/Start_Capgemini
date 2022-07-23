package com.mycompany.exerciciopoo09;

import java.util.Calendar;

public class Data {

    private int ano;
    private int mes;
    private int dia;

    public Data() {
    }

    public Data(int ano, int mes, int dia) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Data clone(Data data) {
        Data clone = new Data(data.ano, data.mes, data.dia);
        return clone;
    }

    public int compara(Data data1) {
        Calendar hoje = Calendar.getInstance();
        System.out.println("teste " + hoje.get(Calendar.DAY_OF_MONTH));
        if (data1.dia == hoje.get(Calendar.DAY_OF_MONTH) && data1.mes == (hoje.get(Calendar.MONTH) + 1) && data1.ano == hoje.get(Calendar.YEAR)) {
            return 0;
        }
        if (hoje.get(Calendar.YEAR) > data1.ano) {
            return 1;
        } else if ((hoje.get(Calendar.MONTH) + 1) > data1.mes) {
            return 1;
        } else if (hoje.get(Calendar.DAY_OF_MONTH) > data1.dia) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean IsBissexto() {
        boolean bissexto = false;
        if (this.ano % 4 == 0 && this.ano % 100 != 0 || this.ano % 4 == 0 && this.ano % 100 == 0 && this.ano % 400 == 0) {
            bissexto = true;
        }
        return bissexto;
    }

    public String getAno() {
        String ano = String.format("%04d", this.ano);
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1300 && ano <= 5000) {
            this.ano = ano;
        } else {
            this.ano = 0001;
        }

    }

    public String getMes() {
        String mes = String.format("%02d", this.mes);
        return mes;
    }

    public String getMesExtenso() {
        String mes = "";
        switch (this.mes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Devembro";
                break;
        }
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            this.mes = 01;
        }

    }

    public String getDia() {
        String dia = String.format("%02d", this.dia);
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            this.dia = 01;
        }

    }

}
