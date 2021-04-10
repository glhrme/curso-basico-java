package br.com.guisantos.Main;

public class Lacos {
    public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10) {
            //System.out.println(contador);
            contador += 1;
        }

        for(int contadorFor=0;contadorFor <= 10; contadorFor++) {
            //System.out.println(contadorFor);
        }

        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna ++) {
                System.out.print("+");
            }
            System.out.println("");

        }
    }
}
