package Poo;

public class Estudante extends Usuario{
    private String cpf;
    private String matricula;
    private String curso;
    private static int numeroDeEstudante =0; 
    

    //CONSTRUTOR
    public Estudante(){
     numeroDeEstudante ++;
    }
    public Estudante(String nome, String matricula){
        super.getNome();
        this.matricula = matricula;
    }
    public void comecarEstudo(){
        System.out.println(super.getNome()+" Comecou a estudar...");
    }
    public void encerrarEstudo(){
        System.out.println(super.getNome()+" falou 'Descansar né que o cara né de ferro...'");
    }
    //ENCAPSULAMENTO
    public String getNome(){
        return super.getNome();
    }
    public void setNome(String nome){
        super.setNome(nome);
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public static int getNumeroDeEstudante() {
        return numeroDeEstudante;
    }
    public static void setNumeroDeEstudante(int numeroDeEstudante) {
        Estudante.numeroDeEstudante = numeroDeEstudante;
    }
    
}
