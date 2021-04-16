package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
  private Conta[] referencias;
  private int posilivre;

  public GuardadorDeContas(){
    this.referencias = new Conta[10];
    this.posilivre = 0;
  }

  public void adiciona(Conta ref) {
    this.referencias[this.posilivre] = ref;
    this.posilivre++;
  }
}