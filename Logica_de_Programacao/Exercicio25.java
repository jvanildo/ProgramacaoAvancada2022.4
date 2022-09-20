package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite 1 se tem o requisito e zero (0) se não tiver: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Tem Interface grafica? (digite 1 ou 0) ");
        a = sc.nextInt();
        System.out.println("Tem Interface Artificial ? (digite 1 ou 0)");
        b = sc.nextInt();
        System.out.println("tem encapsulamento ? (digite 1 ou 0)");
        c = sc.nextInt();
        System.out.println("Tem Indentação ? (digite 1 ou 0)");
        d = sc.nextInt();
        System.out.println("Tem Uso de Structs? (digite 1 ou 0)");
        e = sc.nextInt();

        if ((a == 0) & (b == 0)){
            System.out.println("Trabalho não Aceito!!");
        }else if((c == 0) & (d ==0)){
            System.out.println("Trabalho não Aceito!!");
        }else if((e == 0)){
            System.out.println("Trabalho não Aceito!!");
        }else{
            System.out.println("Trabalho Aceito!!");
        };

        sc.close();
    }
}
