package br.com.alura.leilao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Leilao implements Serializable {

    private final String descricao;

    public Leilao(String descricao) {
        this.descricao = descricao;
        List<Lance> lances = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

}
