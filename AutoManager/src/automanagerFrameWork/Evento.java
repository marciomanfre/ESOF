
package automanagerFrameWork;

import java.util.ArrayList;
import java.util.Date;


public abstract class Evento {

    private Agenda a;
    private static ArrayList<Evento> eventos;
    private Integer eventoID;
    private String descricao;
    private Date data;
    private String importancia;
   
    private String hora;
    private String local;


    public Evento()
    {

    }

    public Evento(String descricao, Date data, String nome, String importancia, Integer eventoID)
    {
        this.eventoID = Agenda.getIDMax();
        Agenda.setIDMax(eventoID+1);
        this.descricao = descricao;
        this.data = data;
        this.importancia = importancia;
        

    }
   
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public String getDescricao()
    {
        return descricao;
    }

    public void setImportancia(String importancia)
    {
        this.importancia = importancia;
    }
    public String getImportancia()
    {
        return importancia;
    }
    
    public void setData(Date data)
    {
        this.data = data;
    }
    public Date getData()
    {
        return data;
    }

    public void setID(Integer id)
    {
        this.eventoID = id;
    }
    public Integer getEventoID()
    {
        return eventoID;
    }

    public abstract Evento buscaEvento(Integer idmax);

    public abstract void adicionarEvento(Evento evento);
    public abstract void removerEvento(Integer eventoID);



}
