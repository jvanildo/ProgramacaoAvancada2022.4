package Logica_de_Programacao;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero=sc.nextInt();
        int i = 0;

	    while (numero > 0) {
	    i *= 10;
	    i += (numero % 10);
	    numero /= 10;
	} 
			 
	 System.out.printf("O número invertido é: ", i);
			
    }
    
}

