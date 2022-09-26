package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tabuada quer consultar ? ");
        int x = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(x+"x"+i+"= "+x*i);
        }
        sc.close();
    }
}
