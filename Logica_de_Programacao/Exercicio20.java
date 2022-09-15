package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char bairro;
        int rendaF=0,consumo=0,desconto=0;
        System.out.println("Qual bairro que vc se localiza? ");
        bairro =sc.next().charAt(0);
        System.out.println("Qual a renda familiar? ");
        rendaF = sc.nextInt();
        System.out.println("Qual o consumo da familia? ");
        consumo = sc.nextInt();
        System.out.println(bairro);
        
    if ((bairro == 's')|(bairro == 'S')|(bairro == 'i')|(bairro == 'I')|(bairro == 't')|(bairro == 'T')){
       if ((bairro == 's')|(bairro == 'S')){
         if ((rendaF>50)&(rendaF<500)){
            desconto= 50;
            consumo = consumo-desconto;
            System.out.println("Valor a pagar: "+consumo);
         }
         if ((rendaF>500)|(rendaF<1000)){
            desconto=25;
            consumo = consumo - desconto;
            System.out.println("Valor a pagar: "+consumo);
         }
         if ((rendaF<0)){
            System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
         }

       if ((bairro == 'i')|(bairro == 'I')){
        if ((rendaF>240)&(rendaF<1000)){
           desconto= 240;
           consumo = consumo-desconto;
           System.out.println("Valor a pagar: "+consumo);
        }
        if ((rendaF>1000)|(rendaF<5000)){
           desconto=25;
           consumo = consumo - desconto;
           System.out.println("Valor a pagar: "+consumo);
        }
        if ((rendaF<0)){
           System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
        }
        }

       if ((bairro == 't')|(bairro == 'T')){
        if ((rendaF>5000)&(rendaF<1000)){
           desconto= 50;
           consumo = consumo-desconto;
           System.out.println("Valor a pagar: "+consumo);
        }
        if ((rendaF>10000)|(rendaF<20000)){
           desconto=25;
           consumo = consumo - desconto;
           System.out.println("Valor a pagar: "+consumo);
        }
        if ((rendaF<0)){
           System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
        }
        }
      sc.close();
    }else{System.out.println("Bairro Invalido!!");}
    }
}
}
