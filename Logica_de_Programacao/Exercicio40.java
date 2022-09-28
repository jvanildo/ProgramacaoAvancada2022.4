package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado X do triangulo: ");
        x = sc.nextInt();
        System.out.println("Digite o lado Y do triangulo: ");
        y = sc.nextInt();
        System.out.println("Digite o lado Z do triangulo: ");
        z = sc.nextInt();

        if ((x == y)&(x == z)){
            System.out.println("Triangulo equilatero!");
        }
        else if ((x+y==z) & (x+z==y) &(y+z!=x)){
            System.out.println("Triangulo isóscelos! ");
        }
        else if ((x+y!=z)& (x+z!=y)&(y+z!=x)){
            System.out.println("Triangulo escaleno! ");
        }
        sc.close();
    }
}
