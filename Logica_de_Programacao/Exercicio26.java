package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
    double altura;
    int anos, aceito=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a sua altura ? ");
    altura = sc.nextDouble();
    System.out.println("Qual a sua idade ? ");
    anos = sc.nextInt();

    if((altura>=1.5)&(anos>=12)){aceito +=1;}
    if((altura>=1.4)&(anos>=14)){aceito +=1;}
    if((altura>=1.7)&(anos>=16)){aceito +=1;}
    
    System.out.println(aceito);

    sc.close();
    }
}
