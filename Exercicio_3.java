import java.util.Scanner;
// Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
// vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
// 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
// do mês, com duas casas decimais.
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comissao = 0.15;
        System.out.println("Qual o nome do vendedor? ");
        String nome = sc.nextLine();
        System.out.println("Qual o  seu salario fixo? ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Quantas vendas foram efetuadas no mês? ");
        double vendas = sc.nextDouble();

        double salarioTotal = (comissao * vendas) + salarioFixo;

        System.out.println("O salario fixo é :"+ salarioFixo);
        System.out.format("o salario com comissão é: "+"%.2f",salarioTotal);

        


    }
}
