package Logica_de_Programacao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taxa1,taxa2,taxa3,taxa4;
        double media;
        System.out.println("Digite 4 medidas de taxas da sua glicose : ");
        taxa1 = sc.nextInt();
        taxa2 = sc.nextInt();
        taxa3 = sc.nextInt();
        taxa4 = sc.nextInt();

        if(taxa1<110){System.out.println(taxa1+" Normal");}
        else if((taxa1>=110)&(taxa1<125)){System.out.println(taxa1+" Alterada");}
        else if(taxa1>=125){System.out.println(taxa1+" Muito Alta");}
        else{System.out.println("Dados invalidos!");}
        
        if(taxa2<110){System.out.println(taxa2+" Normal");}
        else if((taxa2>=110)&(taxa2<125)){System.out.println(taxa2+" Alterada");}
        else if(taxa2>=125){System.out.println(taxa2+" Muito Alta");}
        else{System.out.println("Dados invalidos!");}
        
        if(taxa3<110){System.out.println(taxa3+" Normal");}
        else if((taxa3>=110)&(taxa3<125)){System.out.println(taxa3+" Alterada");}
        else if(taxa3>=125){System.out.println(taxa3+" Muito Alta");}
        else{System.out.println(taxa3+" Dados invalidos!");}

        if(taxa4<110){System.out.println(taxa4+" Normal");}
        else if((taxa4>=110)&(taxa4<125)){System.out.println(taxa4+" Alterada");}
        else if(taxa4>=125){System.out.println(taxa4+" Muito Alta");}
        else{System.out.println(taxa4+" Dados invalidos!");}
        
        media = (taxa1+taxa2+taxa3+taxa4)/4;
        System.out.println("");
        System.out.println("MEDIA DAS LEITURAS = "+media);
        sc.close();
    }
}
