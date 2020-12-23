/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author murillo
 */
public class Config {
    private static final Config instance = new Config();
    
    private String formatRelatorios = "html";
    private String tipo= "pizza";

    private Config(){}
    
    public static Config getInstance(){
        return instance;
    }
    
    /**
     * @return the formatRelatorios
     */
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    /**
     * @param formatRelatorios the formatRelatorios to set
     */
    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
