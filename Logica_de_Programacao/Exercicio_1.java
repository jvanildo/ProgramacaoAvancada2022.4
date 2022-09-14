package Logica_de_Programacao;
import java.util.Scanner;

// Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
// notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
// peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
// pode ir de O até 10.0, sempre com uma casa.

import java.util.Scanner; 
public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double notaA, notaB, pesoA = 3.5,pesoB=7.5, calcMedia = 0;
       
        System.out.println("Digite a primeira nota: ");
        notaA = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notaB = sc.nextDouble();

        calcMedia = ((notaA * pesoA) + (notaB * pesoB))/(pesoA + pesoB);
        sc.close();
        System.out.println("Sua media é: "+calcMedia);
    }

}
