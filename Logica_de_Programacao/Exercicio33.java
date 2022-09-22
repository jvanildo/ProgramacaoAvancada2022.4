package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetidor, cont=0;
        System.out.println("Quantas vezes quer que o programa execute o programa ? ");
        repetidor = sc.nextInt();
        for (int k = 0; k < repetidor; k++) {
            cont +=1;
            System.out.print(cont+" ");
            cont +=1;
            System.out.print(cont+" ");
            cont +=1;
            System.out.print(cont);
            System.out.print(" "+"PUM");
            System.out.println(" ");
        }
        sc.close();
        
        
    }
}
