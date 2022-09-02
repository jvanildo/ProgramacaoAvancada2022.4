import java.util.Scanner;

// Escreva um programa que leia o número de um funcionário, seu número de horas
// trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
// seguir, mostre o número e o salário do funcionário, com duas casas decimais.
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int numFunc = sc.nextInt();

        System.out.println("Digite o numero de horas trabalhada: ");
        int horas = sc.nextInt();

        System.out.println("Quanto recebe por hora trabalhada: ");
        double salarioHora = sc.nextDouble();
        double salario = horas*salarioHora;
        
        System.out.format("O funcionario "+numFunc+" seu salario é de : "+"%.2f", salario);


    }
}
