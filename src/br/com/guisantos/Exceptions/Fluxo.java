package br.com.guisantos.Exceptions;

public class Fluxo {

  public static void main(String[] args) {
      System.out.println("Ini do main");
      try {
        metodo1();
      } catch (Exception e) {
        System.out.println(e);
      }
      System.out.println("Fim do main");
  }

  private static void metodo1() {
      System.out.println("Ini do metodo1");
      metodo2();
      System.out.println("Fim do metodo1");
  }

  private static void metodo2() {
      System.out.println("Ini do metodo2");
      ExceptionCustom ex = new ExceptionCustom("Teste");
      for(int i = 1; i <= 5; i++) {
        System.out.println(i);
        throw ex;
      }
      System.out.println("Fim do metodo2");
  }
}