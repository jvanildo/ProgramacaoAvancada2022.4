package Poo;

public class App {
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante();
        estudante1.setNome("jose");
        System.out.println("nome: "+ estudante1.getNome());

        Estudante estudante2 = new Estudante("jose","123");
        estudante1.setNome("vanildo");
        System.out.printf("nome: "+ estudante2.getNome()+" matricula: "+estudante2.getMatricula());
        estudante2.comecarEstudo();
        estudante2.encerrarEstudo();
    }
}
