package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1,numero2,numeromaior=0,numeromenor=0,soma = 0;
        System.out.println("Digite o primeiro numero : ");
        numero1 =sc.nextInt();
        System.out.println("Digite o segundo numero : ");
        numero2 =sc.nextInt();
        System.out.println(" ");
        if (numero1>numero2){
            numeromaior = numero1;numeromenor=numero2;
        }
        if(numero2>numero1){
            numeromaior = numero2;numeromenor = numero1;
        }

        for (int i = numeromenor; i < numeromaior+1; i++) {
            System.out.println(i);
            soma = soma+i;

        }
        System.out.println("");
        System.out.println(soma);
        sc.close();
        
    }
}
