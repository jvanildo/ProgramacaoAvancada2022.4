import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundo, horas , minutos,valor;
        System.out.println("Quantos segundos de duração? ");
        valor = sc.nextInt();
        horas = (valor/3600);
        valor %= 3600;
        minutos = (valor/60);
        valor %=60;
        segundo = valor;
        
        System.out.print("HH:MM:SS:"+horas);
        System.out.print(":"+minutos);
        System.out.print(":"+segundo);
    }
}