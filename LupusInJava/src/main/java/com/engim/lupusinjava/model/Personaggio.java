package com.engim.lupusinjava.model;

public abstract class Personaggio {
    private String ruolo;
    private boolean vivo;
    private boolean votato;
    private boolean potereUsato;

    private Fazione fazione;

    enum Fazione{BUONO,CATTIVO}

    public abstract void potereNotturno();

}
