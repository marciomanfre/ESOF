

package automanagerFrameWork;

import java.util.ArrayList;


public class Agenda {

    public static Integer  idmax;
    Usuario user;
    ArrayList<Evento> eventos = new ArrayList();

    public Agenda()
    {

    }
    public Agenda(ArrayList<Evento> eventos, Usuario user)
    {
        this.eventos = eventos;
        this.user = user;
    }

    public void setUsuario(Usuario user)
    {
        this.user = user;
    }
    public Usuario getUsuario()
    {
        return user;
    }

    public void setEventos(ArrayList<Evento> eventos)
    {
        this.eventos = eventos;
    }
    public ArrayList<Evento> getEventos()
    {
        return eventos;
    }

    

     public static void setIDMax(Integer idmax)
    {
        Agenda.idmax = idmax;
    }
    public static Integer getIDMax()
    {
        return idmax;
    }

    
}
