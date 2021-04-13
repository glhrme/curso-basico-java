package br.com.guisantos.POO;



public class Gerente extends Funcionario {
  private String email;

  public Gerente(String email) {
    this.email = email;
  }

  public boolean auth(String email) {
    if(email == this.email)
      return true;

    return false;
  }

  public double getBonificacao() {
    // super diz que deve olhar apenas para classe mãe ou seja, funcionario
    return super.getSalario();
  }
}
