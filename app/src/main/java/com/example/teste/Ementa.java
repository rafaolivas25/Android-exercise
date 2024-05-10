package com.example.teste;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private ArrayList<Prato> pratos;

    public Ementa(String nome) {
        this.nome = nome;
        pratos = new ArrayList<>();
    }
    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public String getNome() {
        return nome;
    }

    public void inserir_prato(Prato prato) {
        pratos.add(prato);
    }

    public void remover_prato(Prato prato) {
        pratos.remove(prato);
    }
    public void remover_prato(int pos) {
        pratos.remove(pos);
    }

    public int quantidadePratos() {
        return pratos.size();
    }

    public Prato maior_prato() {
        int cnt=0,cnt_ant=0;
        int pos_maior=-1;
        for(int idx =0;idx<pratos.size();idx++) {
            cnt = pratos.get(idx).getIngredientes().length;
            if(idx!=0)
            {
                if(cnt_ant>cnt)
                {
                    pos_maior=idx;
                }
            }
            cnt_ant=cnt;
        }

        return pratos.get(pos_maior);
    }
}
