package br.com.guisantos.POO;

public class Conta {
    private double saldo = 0.0;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero, Cliente titular) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void depositoDinheiro(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public boolean sacarDinheiro(double valorSaque) {
        if(this.validaSaldo(valorSaque)) {
            this.saldo -= valorSaque;
            return true;
        }

        return false;
    }

    public boolean transferirDinheiro(double valorTED, Conta destino) {
        if(this.validaSaldo(valorTED)) {
            this.saldo -= valorTED;
            destino.depositoDinheiro(valorTED);
            return true;
        }
        return false;
    }

    private boolean validaSaldo(double valorParaValidar) {
        return this.saldo >= valorParaValidar;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    
}
