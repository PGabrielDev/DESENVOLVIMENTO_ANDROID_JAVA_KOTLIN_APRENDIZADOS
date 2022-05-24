package br.com.gabriel.controllers;

import java.util.List;

public interface ICrud<T> {


    void incluir(T objeto);
    void alterar(T objeto);
    void Deletar(T objeto);
    List<T> listar(T objeto);


}
