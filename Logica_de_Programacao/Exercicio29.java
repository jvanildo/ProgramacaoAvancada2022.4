package Logica_de_Programacao;

public class Exercicio29 {
    public static void main(String[] args) {
        int j=60, i=1;
        System.out.print("i="+i+"  j=");
        System.out.print(j);
        System.out.println(" ");
        do {
            i+=3;
            j-=5;
            System.out.print("i="+i+"  "+"j=");
            System.out.print(j);
            System.out.println(" ");
        } while (j >0);
    }
}
