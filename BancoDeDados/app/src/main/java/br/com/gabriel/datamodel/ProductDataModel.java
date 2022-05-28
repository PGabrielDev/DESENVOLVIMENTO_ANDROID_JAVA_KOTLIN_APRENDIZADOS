package br.com.gabriel.datamodel;

public class ProductDataModel {

    public static String createTable(){
        return "create table produto (id integer primary key autoincrement, nome varchar(100), fornecedor varchar(100));";
    }
}
