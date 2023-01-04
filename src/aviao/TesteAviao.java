package aviao;

import contaBancaria.ContaBancaria;

public class TesteAviao {

    public static void main(String[] args){

        Aviao novoAviao = new Aviao("branco",65,65,"Larissa & cia",true);

        System.out.println("A cor do avião é : " + novoAviao.getCor());
        System.out.println("Quantidade de passageiros : " + novoAviao.getPassageiros());
        System.out.println("Quantidade de assentos : " + novoAviao.getAssentos());
        System.out.println("Empresa: " + novoAviao.getCompanhia());
        System.out.println("Há saída emergencia? " + novoAviao.isSaidaEmergencia());
        novoAviao.capacidade();
    }
}
