package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio46 {
    public static long fat_Recursivo(Long n) {
		if(n==0) {			
			return 1;
		}else {			
			return n * fat_Recursivo(n-1);
		}
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, m;

        System.out.println("Informe os valores de M e N");
        m = input.nextLong();
        n = input.nextLong();
        input.close();

        System.out.println(fat_Recursivo(n) + fat_Recursivo(m));
        




    }
}
