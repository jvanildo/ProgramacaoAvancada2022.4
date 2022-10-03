package Poo;

import java.math.BigDecimal;
import java.util.Date;

public class Exercicio18 {
    public class Caixa{
        private BigDecimal valorReceita;
        private Date dataAbertura;
        private Date dataFechamento;

    }
    public class Movimentos extends caixa{
        private Date hora;
        private BigDecimal valor;
    }

    public class Pessoa{
        private String nome;
        private String cpf;
        private int matricula;
        private String nomeUsuario;
        private String cargo;
        private BigDecimal salario;
        private boolean status;
        private String senha;
    }
    public class Endereco extends Pessoa{
        private String rua;
        private int numero;
        private String cep;
        private int telefone;
        private String cidade;
        private String bairro;
    }
    public class Cliente extends Endereco{
        private String nome;
        private String cpf;
        private String nomeUsuario;
        private String cargo;
        private BigDecimal salario;
        private boolean status;
        private String senha;
    }
    public class PedidoDelivery{
        private Cliente cliente;
    }
    public class PagamentoNFE{
        private BigDecimal valor;
        private Date dataPagamento;

        public void efetuarPagamento(){};
    }
    public class Pedido extends PagamentoNFE{
        private Date dataPedido;
        private boolean status;
        private itemPedido item;
        private BigDecimal valorTotal;

        public void statusPedido(){}

    }
    public class Produto{
        private double peso;
        private int quantidade;
        private String nome;
        private BigDecimal valor;
        private String descricao;

    }
    public class itemPedido extends Produto{
        private int quantidade;
        private Produto produto;
    }
    public class Gerente extends Pessoa{
        public void listaFuncion(){}
        public void listaCliente(){}
        public void criarFuncionario(){}
    }
    public class PedidoBasico extends Gerente{
        private String nome;
    
    }
}
