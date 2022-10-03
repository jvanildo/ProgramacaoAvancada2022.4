package Poo;

public class Exercicio15 {
    public class  Pessoa{
        private int id;
        private String nome;
        private String nomeFantasia;
        private String logradouro;
        private int numero;
        private String complemento;
        private String bairro;
        private String cep;
        private String cidade;
        private String uf;

        public void getters(){}
        public void setters(){}
    }
    public class Fisica extends Pessoa{
        private String cpf;
        private String rg;
        private String genero;
        private Data nasc;

        public void getters(){}
        public void setters(){}
    }
    public class Juridica extends Pessoa{
        private String cnpj;
        private String inscricaoEstadual;
        private Data fundacao;

        public void getters() {};
        public void setters() {};
    }
    public class Parceiro{
        private String tipoPessoa;
        private float desempenho;

        public void cadastrar (){ }
        public void bloquear (){ }
        public void excluir (){}
    }
    public class Colaborador extends Fisica{
        private String ctps;
        private String pis;
        private String tituloEleitor;
        private boolean reservista;
        private String estadoCivil;
        private int numDependentes;
        private boolean ativo;
        private String setor;
        private String cargo;
        private float salario;
        private String telefone1;
        private String telefone2;
        private String emailPessoal;
        private String emailCorporativo;

        public void getters(){}
        public void setters(){}
        public void admitir(){}
        public void demitir(){}
    }
    public class Usuario extends Colaborador{
        private String login;
        private String senha;
        private String permissao;

        public void getters() {};
        public void setters() {};
        private void editarPerfil(){};
        private void alterarSenha(){};
        private void criarUsuario(){};
        private void apagarUsuario(){};
        
    }
}
