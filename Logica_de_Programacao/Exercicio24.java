package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindromo = "";
        String numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextLine();

        for(int i = numero.length() -1; i >= 0; i--){
            palindromo += numero.charAt(i);
        };
        if(palindromo.equals(numero)){
            System.out.println("S");
        }else{
            System.out.println("N");
        }

        sc.close();
    }
}
