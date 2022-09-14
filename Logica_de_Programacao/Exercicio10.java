package Logica_de_Programacao;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, mes , dia,valor;
        System.out.println("Digite o valor da idade em dias: ");
        valor = sc.nextInt();

        ano = (valor/365);
        valor%=365;
        mes = (valor/30);
        valor %=30;
        dia = valor;

        System.out.println(ano +" ano (s)");
        System.out.println(mes +" mês (es)");
        System.out.println(dia +" dia (s)");
    }
}
