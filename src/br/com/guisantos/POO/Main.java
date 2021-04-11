package br.com.guisantos.POO;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(10.0, 0151, 79901, "Guilherme de Assis dos Santos");
        System.out.println(conta1.getTitular());
    }
}
