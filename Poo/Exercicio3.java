package Poo;

public class Exercicio3 {
    public class Terrestre{
        private int qtdeRoda;
        private double potencia;
    }
    public class MeioDeTransporte extends Terrestre{
        private int id;
        private short ano;
        private String modelo;
        private double cargaMaxima;

        public double consumo(){
            return super.potencia*this.cargaMaxima*100;
        }
    }
}
