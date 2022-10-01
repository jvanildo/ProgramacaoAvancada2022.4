package Poo;

public class Exercicio7 {
    public class Item{
        private int codigo;
        private String nome;
        private String descricao;
    }
    public class Modelo extends Item{
        private int codigo;
        private String marca;
        private String nome;
        private double motor;
        private int serie;
    }
    public class Carro extends Modelo{
        private int chassi;
        private String cor;
        private int anoFabricacao;
        private int anoModelo;
        private Date dataDeEntrada;
    }
}
