package Poo;

import java.net.URI;
import java.sql.Time;
import java.util.Date;

public class Exercicio17 {
    public class Pessoa{
        private String nome;
        private String cpf;
        private URI foto;
        private Strng email;

    }
    public class Usuario extends Pessoa{
        public String login;
        public String senha;
    }
    public class Disciplina extends Pessoa{
        private String nome;
        private String codigo;

    }
    public class Amigo extends Pessoa{
        private String nome;
        private String email;

    }
    public class Evento extends Pessoa{
        private String nome;
        private String descricao;
        private Time horaInicio;
        private Date dataInicio;
        private Date dataFim;

        public void compartilharEvento(){}

    }
    public class NivelPrioridade extends Evento{
    }
}
