package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
  public static void main(String[] args) {
    GuardadorDeContas guardador = new GuardadorDeContas();

    Conta cc = new ContaCorrente(1,2);

    guardador.adiciona(cc);
  }
  
}
