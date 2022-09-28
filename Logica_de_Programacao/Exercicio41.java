package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso,altura;
        System.out.println("Qual seu peso ? ");
        peso = sc.nextDouble();
        System.out.println("Qual sua altura ? ");
        altura = sc.nextDouble();

        if (altura <= 1.50){
            if (peso>50){
                System.out.println("Emagreça "+(peso-50)+" KG.");
            }
            else if(peso == 50){System.out.println("Peso ideal !!");}
            else{System.out.println("engorde "+(50-peso)+" KG.");}
        }
        else if ((altura > 1.51)&(altura<1.90)){
            if (peso>70){
                System.out.println("Emagreça "+(peso-70)+" KG.");
            }
            else if(peso == 70){System.out.println("Peso ideal !!");}
            else{System.out.println("engorde "+(70-peso)+" KG.");}
        }
        else if (altura>1.91){
            if (peso>100){
                System.out.println("Emagreça "+(peso-100)+" KG.");
            }
            else if(peso == 50){System.out.println("Peso ideal !!");}
            else{System.out.println("engorde "+(100-peso)+" KG.");}
        }
        sc.close();
    }
}
