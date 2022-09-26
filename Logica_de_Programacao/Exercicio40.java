package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A do triangulo: ");
        a = sc.nextInt();
        System.out.println("Digite o lado B do triangulo: ");
        b = sc.nextInt();
        System.out.println("Digite o lado C do triangulo: ");
        c = sc.nextInt();

        if ((a == b)&(a == c)){
            System.out.println("Triangulo equilatero!");
        }
        else if ((a+b==c) & (a+c==b) &(b+c!=a)){
            System.out.println("Triangulo ");
        }
        
    }
}
