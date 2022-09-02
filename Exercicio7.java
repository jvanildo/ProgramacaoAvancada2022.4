import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        nota100 = (valor/100);
        valor%=100;
        nota50 = (valor/50);
        valor%=50;
        nota20 = (valor/20);
        valor%=20;
        nota10 = (valor/10);
        valor%=10;
        nota5 = (valor/5);
        valor%=5;
        nota2 = (valor/2);
        valor%=2;
        nota1 = valor;
        sc.close();

        System.out.println(nota100 + " nota(s) de 100.");
        System.out.println(nota50 + " nota(s) de 50.");
        System.out.println(nota20 + " nota(s) de 20.");
        System.out.println(nota10 + " nota(s) de 10.");
        System.out.println(nota5 + " nota(s) de 5.");
        System.out.println(nota2 + " nota(s) de 2.");
        System.out.println(nota1 + " nota(s) de 1.");
    
    }
}
