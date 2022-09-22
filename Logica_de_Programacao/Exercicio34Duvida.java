package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio34Duvida {
    public static void main(String[] args) {
        int x=0,y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros quer que mostre ?");
        y = sc.nextInt();
        System.out.println("Quantas colunas tem que ter ? ");
        x = sc.nextInt();

        for (int i = 1; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
