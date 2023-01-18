package cliente;

public class PessoaFisica extends Cliente {
    private boolean contaAtiva;

    public PessoaFisica(String nome, String sobrenome, String endereco, int cpf, int idade){
        super(nome, sobrenome,endereco,cpf,idade);
        this.contaAtiva = contaAtiva;
    }
}
