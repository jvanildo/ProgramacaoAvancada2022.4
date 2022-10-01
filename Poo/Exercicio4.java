package Poo;

public class Exercicio4 {
    public class ItemDeLoja{
        private int codigoDoItem;
        private String nomeDoItem;
        private String descricaoDoItem;
        private double valorDoItem;
        
        public int getIndetificador(){return 1;}
    }
    public class Ferramenta{
        private String categoria;
        private Integer serial;

        public int getIndetificador(){
            return 1;
        }
        public void separar(){System.out.println("outros");}
        public void separar (String valor){}

    }
    public class Alimento{
        private Integer selo;
        public int getIndetificador(){
            return 1;
        }
    }
}
