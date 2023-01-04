package contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private boolean cheque;

    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, boolean cheque) {
        super(numero, agencia, tipo, titular, saldo);
        this.cheque = cheque;
    }
}
