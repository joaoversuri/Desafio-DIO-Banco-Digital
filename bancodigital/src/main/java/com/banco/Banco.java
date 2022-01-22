package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final String NOME_PADRAO = "Banco Nestor Peçanha S.A.";
    private static final String ENDERECO_PADRAO = "Av. Paulista, 1234, Bela Vista - São Paulo/SP";

    protected String nome;
    protected String endereco;
    public List<Conta> contas = new ArrayList<>();

    protected Banco(){
        this.nome = NOME_PADRAO;
        this.endereco = ENDERECO_PADRAO;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }





}
