import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rh,rm,rc,rl,ir;
        String alio="";
        System.out.println("Renda do homem: ");
        rh = sc.nextDouble();
        System.out.println("Renda da mulher: ");
        rm = sc.nextDouble();
        rc = rh +rm;
        ir = 0;
        if(rc <= 900){alio = "Insento!";}
        if((rc >= 900.01) &&(rc<=1500.00)){alio = "10%"; ir = 0.10 * rc;}
        if((rc >= 1500.01) &&(rc<=2500.00)){alio = "15%"; ir = 0.15 * rc;}
        if(rc >2500){alio = " 25%";ir = 0.25* rc;}
        rl = rc -ir;
        System.out.println("Renda cojunta: " + rc);
        System.out.println("Alíquota utilizada: " + alio);
        System.out.println("Imposto de renda: " + ir);
        System.out.println("Renda líquida: "+ rl);
    }
}
