package br.com.gabriel.models;

import android.content.Intent;

public class Client {
    private Integer id;
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public  Client(){

    }
}
