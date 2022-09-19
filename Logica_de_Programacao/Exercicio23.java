package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int x ,y; 
        System.out.println("Digite dois numeros: ");
        x =sc.nextInt();
        y =sc.nextInt();

        System.out.println((x>y)?1:0);
        System.out.println((x==y)?1:0);
        System.out.println((x<y)?1:0);
        System.out.println((x!=y)?1:0);
        System.out.println((x>=y)?1:0);
        System.out.println((x<=y)?1:0);
        sc.close();
    }
}
