import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;

        System.out.println("Qual o seu salario? ");
        salario = sc.nextInt();
        if(salario >500)salario=(salario*0.10)+salario;System.out.println("Seu salario atualizado é: "+salario);
        if((salario >300)&(salario<500))salario=(salario*0.07)+salario;System.out.println("Seu salario atualizado é: "+salario);
        if(salario <300)salario=(salario*0.05)+salario;System.out.println("Seu salario atualizado é: "+salario);
    }
}
