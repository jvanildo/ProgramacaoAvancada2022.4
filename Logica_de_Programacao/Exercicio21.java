package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carro1,carro2,carro3,velocidade1,velocidade2,velocidade3;
        int carroNovo=0,carroMedio=0,velocidadeMaior=0,velocidadeMedia=0;
        System.out.println("Digite o ano dos três carros? ");
        carro1 = sc.nextInt();
        carro2 = sc.nextInt();
        carro3 = sc.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Digite três velociades? ");
        velocidade1 = sc.nextInt();
        velocidade2 = sc.nextInt();
        velocidade3 = sc.nextInt();
        
        int carroVelho = carro1;

        if(carro1>carroNovo){carroNovo = carro1;}
        if(carro2>carroNovo){carroNovo = carro2;}
        if(carro3>carroNovo){carroNovo = carro3;}

        if(carro1<carroVelho){carroVelho = carro1;}
        if(carro2<carroVelho){carroVelho = carro2;}
        if(carro3<carroVelho){carroVelho = carro3;}

        if((carro1 != carroVelho)&(carro1 != carroNovo)){carroMedio = carro1;}
        if((carro2 != carroVelho)&(carro2 != carroNovo)){carroMedio = carro2;}
        if((carro3 != carroVelho)&(carro3 != carroNovo)){carroMedio = carro3;}


        int velocidadeMenor = velocidade1;
        if(velocidade1>velocidadeMaior){velocidadeMaior = velocidade1;}
        if(velocidade2>velocidadeMaior){velocidadeMaior = velocidade2;}
        if(velocidade3>velocidadeMaior){velocidadeMaior = velocidade3;}

        if(velocidade1<velocidadeMenor){velocidadeMenor = carro1;}
        if(velocidade2<velocidadeMenor){velocidadeMenor = carro2;}
        if(velocidade3<velocidadeMenor){velocidadeMenor = carro3;}

        if((velocidade1 != velocidadeMaior)&(velocidade1 != velocidadeMenor)){velocidadeMedia = velocidade1;}
        if((velocidade2 != velocidadeMaior)&(velocidade2 != velocidadeMenor)){velocidadeMedia = velocidade2;}
        if((velocidade3 != velocidadeMaior)&(velocidade3 != velocidadeMenor)){velocidadeMedia = velocidade3;}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Carro mais novo : " + carroNovo);
        System.out.println("Carro medio: "+ carroMedio);
        System.out.println("Carro Velho: "+ carroVelho);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Velocidade Mais rapida : " + velocidadeMaior);
        System.out.println("Velocidade media: "+ velocidadeMedia);
        System.out.println("Velocidade lenta: "+ velocidadeMenor);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sc.close();
    }   
}
