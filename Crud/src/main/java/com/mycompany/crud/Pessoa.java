/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud;

/**
 *
 * @author thiag
 */
public class Pessoa {

    private int id;
    private String nome;
    private String adi;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAdi(){
        return adi;
    }
    public void setAdi(String adi){
        this.adi = adi;
    }
}
