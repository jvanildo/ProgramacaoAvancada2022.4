package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0, y=1;
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        int f =1;
        while(f<y){
            System.out.println();
            for(int j =0; j<x; j++){
                System.out.print(f+" ");
                f++;
            }
            
        }
    }
}
