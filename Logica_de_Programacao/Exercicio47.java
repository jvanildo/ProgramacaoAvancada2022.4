package Logica_de_Programacao;

public class Exercicio47 {
    public static void main(String[] args) {
        long n=1;
        for(int i=0; i<19; i++){
            if(i==0){
                System.out.print(n+" ");
            }
            System.out.print((n *= 3)+" "); 
        }
    }
}
