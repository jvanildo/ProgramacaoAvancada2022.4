package Poo;

public class Exercicio16 {
    public class Texto{
        private String menssagem;
    }
    public class email extends Texto{
        private int nomeDoEmail;

        public void Escrever(){}
        public void excluir (){}
        public void anexar (){}
        public void responder (){}

    }
    public class Destinatario{
        private int emailDestinatario;

        public Destinatario buscar(){};
        public void adcionar(){};
        public void apagar(){};

    }
    public class Arquivos extends email{
        private String nomeArquivo;
        private int tamanho;
        private String formato;

        public void anexar(){}
        public void remover(){}
    }
    public class Assunto{}
}
