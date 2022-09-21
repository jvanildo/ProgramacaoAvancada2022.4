package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;

        System.out.println("Digite a sua primeira nota : ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota : ");
        nota2 = sc.nextDouble();
        sc.close();
        if((nota1 <0)|(nota2<0)){
            System.out.println("Nota invalida !");
        }else{
         media = (nota1+nota2)/2;
         System.out.println("Media= "+media);
        
        }
    }
}
