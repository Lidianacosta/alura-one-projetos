package br.com.bytebank.banco.modelo;

public abstract interface Autenticado {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}

