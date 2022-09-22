package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos HO tem ? ");
        x = sc.nextInt();
        if (x !=0){
        for (int i = 0; i < x; i++) {
            System.out.print("HO");
            System.out.println(" ");
        }
        System.out.print("!");
    }else{System.out.println("Digite um numero valido !");}
    }
}
