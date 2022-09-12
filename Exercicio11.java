import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas o jogo comecou?");
        int hrIni = sc.nextInt();
        System.out.println("Que horas o jogo terminou?");
        int hrFin = sc.nextInt();
        sc.close();
        int tempoIni = hrIni * 60;
        int tempoFin = hrFin * 60 ;
        int duracao;
        if (tempoIni < tempoFin) {duracao = tempoFin - tempoIni;}
        else {duracao = (24 * 60 - tempoIni) + tempoFin;}
        int duracaoHoras = duracao / 60;
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S)" );
    }
}