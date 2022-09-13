import java.util.Scanner;
//fazendo um teste
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite o valor que vai selecionar : ");
        x = sc.nextInt();
       for (int i = 0; i < 12; i++) {
            if (x%2!=0){
             System.out.print(x+" ");
            }
         x+=1;
        }
    }
}
