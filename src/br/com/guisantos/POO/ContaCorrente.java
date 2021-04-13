package br.com.guisantos.POO;

public class ContaCorrente extends Conta {
  public ContaCorrente(int agencia, int numero, Cliente titular) {
    super(agencia, numero, titular);
  }

  @Override
  public boolean sacarDinheiro(double valorSaque) {
    double valorASacar = valorSaque + 0.1;
    return super.sacarDinheiro(valorASacar);
  }
}
