package br.com.gabriel.controllers;

import java.util.List;

public interface ICrud<T> {


    boolean incluir(T objeto);
    boolean alterar(T objeto);
    boolean Deletar(Integer id);
    List<T> listar(T objeto);


}
