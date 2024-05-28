package com.darkcode.app.domain;

import lombok.Data;

@Data
public class Tutorial {
    private String nombre;
    private String descripcion;
    private String url;
    private String estado;
    private String fecha;
    private String autor;

    public Tutorial(){}

    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getUrl(){
        return url;
    }
    public String getEstado(){
        return estado;
    }
    public String getFecha(){
        return fecha;
    }
    public String getAutor(){
        return autor;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    public void setUrl(String url){
        this.url= url;
    }
    public void setEstado(String estado){
        this.estado= estado;
    }
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    
}
