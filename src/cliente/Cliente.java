package cliente;

public class Cliente {

    //atributos-caracteristicas do objeto
    private String nome;
    private String sobrenome;
    private String endereco;
    private int idade;
    private int cpf;

    //metodos construtores de Cliente
    public Cliente(String nome, String sobrenome, String endereco, int cpf, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }

    //metodos acessores da classe Cliente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}



