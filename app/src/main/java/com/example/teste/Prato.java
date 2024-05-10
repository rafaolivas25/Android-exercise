package com.example.teste;

public class Prato {
    private String nome;
    private String[] ingredientes;
    private Double cozedura;
    private int dificuldade;
    private String instrucoes;

    public Prato(String nome) {
        this.nome = nome;
        ingredientes = new String[0];
    }

    public Prato(String nome, Double cozedura) {
        this.nome = nome;
        this.cozedura = cozedura;
        ingredientes = new String[0];
    }

    public String getNome() {
        return nome;
    }

    public Double getCozedura() {
        return cozedura;
    }

    public void setCozedura(Double cozedura) {
        this.cozedura = cozedura;
    }

    public void addingredientes(String ingrediente) {
        ingredientes=arrayString(ingredientes,ingrediente);
    }

    public void removeringredientes(String ingrediente) {
        ingredientes=removearrayString(ingredientes,ingrediente);
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public static String [] removearrayString(String[] array, String add) {
        String [] array2 = new String[array.length-1];
        for (int num =0 ; num<array.length;num++)
        {
            if(!array[num].equals(add))
                array2[num]=array[num];
        }
        return array2;
    }

    public static String [] arrayString(String[] array, String add) {
        String [] array2 = new String[array.length+1];
        for (int num =0 ; num<array.length;num++)
        {
            array2[num]=array[num];
        }
        array2 [array.length] = add;
        return array2;
    }

}

