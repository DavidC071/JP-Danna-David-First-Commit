package model;

public class ConsumokWH {
    private double[][] consumos; //Matriz Dia/Hora

    //Constructor segun dias
    public ConsumokWH(int dias) {
        consumos = new double[dias][23]; //Horas
    }

    //Metodo establc valor consumo h d especifico
    public void setConsumo(int dia, int hora, double valor) {
        consumos[dia][hora] = valor;
    }

    //Metodo obtner 
    public double getConsumo(int dia, int hora) {
        return consumos[dia][hora];
    }

    //Devulv matiz de cons
    public double[][] getConsumos() {
        return consumos;
    }

    //devulv los dias regstrados
    public int getTotalDias() {
        return consumos.length;
    }
}