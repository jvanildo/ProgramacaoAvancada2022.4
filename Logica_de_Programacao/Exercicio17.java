package Logica_de_Programacao;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes rodar o sistema?  ");
        int valor = sc.nextInt();
        int numInt, cont;
        for (int i = 0; i < valor; i++) {
        	cont = 0;
            System.out.println("Digite um numero para descobrir se é primo ou não: ");
        	numInt = sc.nextInt();
            System.out.println("----------------------------------------------------");
        	for (int j = 2; j < numInt; j++) {
        		if (numInt % j == 0) cont++;
        	}
        	if (cont == 0) {System.out.println(numInt + " é primo");}
        	else {System.out.println(numInt + " nao eh primo");}
        }
    
    }
}
