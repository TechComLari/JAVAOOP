package contaBancaria;

//nome do objeto
public class ContaBancaria {

    //atributos-caracteristicas do objeto
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    //metodos contrutores da classe ContaBancaria
    public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos acessores da classe ContaBancaria
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //metodos especificos de conta bancaria
    public boolean sacar(float valorSacado) {
        if (this.getSaldo() < valorSacado) {
            System.out.println("Saldo insuficiente, tente quando estiver rico! :)");
            return false;
        }

        this.setSaldo(this.getSaldo() - valorSacado);
        {
            System.out.println("Valor sacado " + valorSacado + " com sucesso! O seu valor de saldo agora é: " + this.getSaldo());
            return true;
        }

    }
}
