import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoUm;
        String tipoDois;
        String tipotres;
        System.out.println("Digite a primeira opcao entre (vertebrado) e (invertebrado):");
        tipoUm = sc.nextLine();
        System.out.println("Digite a primeira opcao entre (ave),(mamifero), (inseto) e (anelideo):");
        tipoDois = sc.nextLine();
        System.out.println("Digite a primeira opcao entre (carnivoro), (onivoro), (herbivoro), (hematofago), (herbivoro) e (hematofago):");
        tipotres = sc.nextLine();
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("ave")==0)&(tipotres.compareToIgnoreCase("carnivoro")==0)){System.out.println("Seu animal é a águia");}
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("ave")==0)&(tipotres.compareToIgnoreCase("onivoro")==0)){System.out.println("Seu animal é a pomba");}
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("mamifero")==0)&(tipotres.compareToIgnoreCase("onivoro")==0)){System.out.println("Seu animal é a homem");}
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("mamifero")==0)&(tipotres.compareToIgnoreCase("herbivoro")==0)){System.out.println("Seu animal é a vaca");}
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("inseto")==0)&(tipotres.compareToIgnoreCase("hematofago")==0)){System.out.println("Seu animal é a pulga");}
        if((tipoUm.compareToIgnoreCase("vertebrado")==0)&(tipoDois.compareToIgnoreCase("inseto")==0)&(tipotres.compareToIgnoreCase("herbivoro")==0)){System.out.println("Seu animal é a lagarta");}
        if((tipoUm.compareToIgnoreCase("invertebrado")==0)&(tipoDois.compareToIgnoreCase("anelideo")==0)&(tipotres.compareToIgnoreCase("hematofago")==0)){System.out.println("Seu animal é a sanguessuga");}
        if((tipoUm.compareToIgnoreCase("invertebrado")==0)&(tipoDois.compareToIgnoreCase("anelideo")==0)&(tipotres.compareToIgnoreCase("onivoro")==0)){System.out.println("Seu animal é a minhoca");}
        else{System.out.println("Animal não encontrado!");}
    }
}
