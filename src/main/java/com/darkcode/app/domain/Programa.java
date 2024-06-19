package com.darkcode.app.domain;

import lombok.Data;

@Data
public class Programa {
    private String nombreP;
    private String nivel;
    private String creditos;
    private boolean estadoP;
    
    public Programa(){}

    public String getNombreP(){
        return nombreP;
    }
    public String getNivel(){
        return nivel;
    }
    public String getCreditos(){
        return creditos;
    }
    public boolean  getEstadoP(){
        return estadoP;
    }
    public void setNombreP(String nombreP){
        this.nombreP= nombreP;
    }
    public void setNivel(String nivel){
        this.nivel= nivel;
    }
    public void setCreditos(String creditos){
        this.creditos= creditos;
    }
    public void setEstadoP(boolean estadoP){
        this.estadoP= estadoP;
    }
}
