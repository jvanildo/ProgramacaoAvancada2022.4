import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int x,cont=0,t1=0,t2=1,t3=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros da sequencia de fribonacci deseja exibir? ");
        x = sc.nextInt();
        while (cont<x) {
            t3=t1+t2;
            System.out.print(" "+t1);
            t1=t2;
            t2=t3;
            cont= cont +1;

        }
    }
}
