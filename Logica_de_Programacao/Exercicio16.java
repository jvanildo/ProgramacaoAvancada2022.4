package Logica_de_Programacao;
import java.util.Scanner;

public class Exercicio16 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double paisA , paisB;
        int ano = 0;
         do {
             System.out.println("Qual a população do pais A ? ");
             paisA = sc.nextDouble();
             System.out.println("Qual a população do pais B ? ");
             paisB = sc.nextDouble();
    
            } while (paisB<paisA);
            do {
                paisA = (paisA * 0.03)+paisA;
                paisB = (paisB * 0.015)+paisB;   
                ano+=1;
            } while (paisA<paisB);
         System.out.println(ano+" anos.");
        }
    }
