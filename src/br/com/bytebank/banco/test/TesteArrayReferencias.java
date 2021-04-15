package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        
        //valor padrão referência = null
        ContaCorrente[] contas = new ContaCorrente[5];
        contas[0] = new ContaCorrente(0151, 79901);
        contas[1] = new ContaCorrente(0151, 87901);

        Conta[] contas1 = new Conta[10];
        contas1[0] = new ContaPoupanca(111, 12);

        //Casting
        ContaPoupanca cp1 = (ContaPoupanca) contas1[0];

        Object[] arrayDeObjetos = new Object[10];
        arrayDeObjetos[0] = cp1;

        ContaPoupanca cp11 = (ContaPoupanca) arrayDeObjetos[0];

    }
    
}
