package br.com.gabriel.datamodel;

public class ClienteDataModel {


    public static String createTable(){
        return "create table cliente (id integer primary key autoincrement, nome varchar(100), email varchar(100));";
    }


}
