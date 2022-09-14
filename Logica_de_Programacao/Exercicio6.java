package Logica_de_Programacao;
import java.util.Scanner;

/**
 * Exercicio6
 */
public class Exercicio6 {
    public static void main(String[] args) {
        double precoGasolina = 0.816;
        double precoGasto;
        double valorTotal;
        int kmRodado;
        double gastos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos Km rodados na viagem ? ");
        kmRodado = sc.nextInt();
        System.out.println("Qual foi o gasto com a gasolina ? ");
        precoGasto = sc.nextDouble();
        valorTotal=precoGasto*precoGasolina;
        gastos = kmRodado*valorTotal;
        System.out.println("Consumo medio : " + gastos +" Km/l");
        

    }
}
