package contaBancaria;

public class ContaPoupanca extends ContaBancaria{
    private boolean juros;

    public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, boolean juros) {
        super(numero, agencia, tipo, titular, saldo);
        this.juros = juros;
    }
}
