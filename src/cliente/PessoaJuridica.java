package cliente;

public class PessoaJuridica extends Cliente {
    private int CNPJ;
    private boolean socios;

    public PessoaJuridica(String nome, String sobrenome, String endereco, int cpf, int idade){
        super(nome, sobrenome,endereco,cpf,idade);
        this.CNPJ = CNPJ;
        this.socios = socios;
    }
}
