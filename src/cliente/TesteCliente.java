package cliente;

public class TesteCliente {
    public static void main(String[] args){

        Cliente novoCliente = new Cliente("larissa", "soares", "pera", 1234567891, 24);

        System.out.println("Nome do cliente: " + novoCliente.getNome());
        System.out.println("Nome do cliente: " + novoCliente.getSobrenome());
        System.out.println("Nome do cliente: " + novoCliente.getEndereco());
        System.out.println("Nome do cliente: " + novoCliente.getCpf());
        System.out.println("Nome do cliente: " + novoCliente.getIdade());
    }
}