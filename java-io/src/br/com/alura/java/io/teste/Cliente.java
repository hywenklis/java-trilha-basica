package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 *
 * Classe que representa um cliente no bytebank
 * 
 * @author Herbert
 * @version 0.1
 */

public class Cliente implements Serializable {

    private static final long serialVersionUID = -6757941299667720144L;

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Nome: " + super.toString();
    }
}
