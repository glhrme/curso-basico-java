package br.com.guisantos.POO;

public class Cliente {
    private String cpf;
    private String nome;
    private String profissao;

    public Cliente(String cpf, String nome, String profissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
