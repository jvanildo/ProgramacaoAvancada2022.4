import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o primeiro numero: ");
      int numero1 = sc.nextInt();
      System.out.println("Digite o segundo numero: ");
      int numero2 = sc.nextInt();
      System.out.println("Digite o terceiro numero: ");
      int numero3 = sc.nextInt();
      int numMaior = numero1,numMenor = numero1,numMedio=0;

      if (numero1 >numMaior){numMaior = numero1;}
      if((numero2>numMaior)){ numMaior = numero2; numMedio = numero1; }
      if((numero3>numMaior)){numMaior= numero3;numMedio = numero2;}
      if(numero1<numMenor){numMenor = numero1;}
      if(numero2<numMenor){numMenor=numero2;}
      if(numero3<numMenor){numMenor=numero3;}

      System.out.println("");
      System.out.println(numMaior);
      System.out.println(numMedio);
      System.out.println(numMenor);
    }
}    
