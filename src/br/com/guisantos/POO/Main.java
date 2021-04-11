package br.com.guisantos.POO;

public class Main {
    public static void main(String[] args) {
        Cliente brendaCliente = new Cliente("47868446800", "Brenda", "Dev");
        Cliente guilhermeCliente = new Cliente("47868446838", "Guilherme", "Dev Tbm");
        Conta conta = new Conta(0151, 79901, guilhermeCliente);
        Conta brenda= new Conta(0222, 18920, brendaCliente);

        conta.depositoDinheiro(1000);
        brenda.depositoDinheiro(0);
        System.out.println("Guilherme: " + conta.getSaldo());
        System.out.println("Brenda: " + brenda.getSaldo());
        conta.transferirDinheiro(200, brenda);
        System.out.println("Guilherme: " + conta.getSaldo());
        System.out.println("Brenda: " + brenda.getSaldo());
        brenda.transferirDinheiro(10, conta);
        System.out.println("Guilherme: " + conta.getSaldo());
        System.out.println("Brenda: " + brenda.getSaldo());
    }
}
