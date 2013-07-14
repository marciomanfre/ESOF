package model;
// Generated 10/04/2013 09:44:27 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Prova generated by hbm2java
 */
public class Prova  implements java.io.Serializable {


     private int idevento;
     private Usuario usuario;
     private String descricao;
     private Date data;
     private String importancia;
     private String hora;
     private String local;
     private Double nota;
     private String materia;

    public Prova() {
    }

	
    public Prova(int idevento) {
        this.idevento = idevento;
    }
    public Prova(int idevento, Usuario usuario, String descricao, Date data, String importancia, String hora, String local, Double nota, String materia) {
       this.idevento = idevento;
       this.usuario = usuario;
       this.descricao = descricao;
       this.data = data;
       this.importancia = importancia;
       this.hora = hora;
       this.local = local;
       this.nota = nota;
       this.materia = materia;
    }
   
    public int getIdevento() {
        return this.idevento;
    }
    
    public void setIdevento(int idevento) {
        this.idevento = idevento;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getImportancia() {
        return this.importancia;
    }
    
    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getLocal() {
        return this.local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    public Double getNota() {
        return this.nota;
    }
    
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public String getMateria() {
        return this.materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }




}

