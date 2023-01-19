package contaBancaria;

import java.util.ArrayList;

public class TesteContaBancaria {

    public static void main(String[] args){

        //Jeito mais limpinho

        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        ContaBancaria contaLarissa = new ContaBancaria(05,12345,1,"Larissa", 500f);

        contas.add(contaLarissa);

        System.out.println("Contas cadastradas atualmente: " + contas.toArray());

       // ContaBancaria novaConta = new ContaBancaria(12,65,2,"Larissa",1200f);

        //System.out.println("Numero da conta: " + novaConta.getNumero());
        //System.out.println("Agencia da conta: " + novaConta.getAgencia());
        //System.out.println("Conta da conta: " + novaConta.getTipo());
        //System.out.println("Titular da conta: " + novaConta.getTitular());
        // System.out.println("Saldo da conta: " + novaConta.getSaldo());

        //novaConta.sacar(200);
    }
}
