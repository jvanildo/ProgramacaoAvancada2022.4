package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decisao, alcool=0,gasolina=0,diesel=0,valor,ltalcool=0,ltgasolina=0,ltdiesel=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual combustivel vc colocou no veiculo ? ");
            decisao = sc.nextInt();
            System.out.println("Qual valor da recarga ? ");
            valor = sc.nextInt();
            if (decisao == 1){
                alcool +=1;
                ltalcool = valor+valor;
            }
            else if (decisao == 2){
                gasolina +=1;
                ltgasolina = valor+valor;
            }
            else if (decisao == 3){
                diesel +=1;
                ltdiesel = valor+valor;
            }else{System.out.println("Dados invalidos !!");}
            
        }
            System.out.println("1-Alcool: "+alcool+" Qtd.litros: "+ltalcool);
            System.out.println("2-Gasolina: "+gasolina+" Qtd.litros: "+ltgasolina);
            System.out.println("3-Diesel: "+diesel+" Qtd.litros: "+ltdiesel);
            sc.close();
    }
}
