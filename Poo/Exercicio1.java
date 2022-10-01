package Poo;

public class Exercicio1 {
    private Integer id;
    private Integer ano;
    private String modelo;
    private double cargaMaxima;
    private double potencia;
    
    public Exercicio1() {
        this.id = 0;
        this.ano = 0;
        this.modelo ="vazio";
        this.cargaMaxima = 0;
        this.potencia = 0;
    }

    public Exercicio1(Integer id, Integer ano, String modelo, double cargaMaxima, double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public double consumo(){
        double consumo = potencia*cargaMaxima*100;
        
        return consumo;
    }
    public static void main(String[] args) {
        Exercicio1 ex1 = new Exercicio1(1,2016,"chev",100,300);
        System.out.println(ex1.consumo());
    }
}
