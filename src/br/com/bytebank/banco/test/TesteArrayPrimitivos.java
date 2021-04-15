package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {

        int[] idades = new int[5];
        for(int i = 0; i < idades.length; i++){
            idades[i] = 5+i*9;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
        
    }
}
