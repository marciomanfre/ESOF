
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Persistencia {
    private static SessionFactory factory;
    public static Persistencia instancia;
    
    
    public Persistencia() throws Exception{
        factory = new Configuration().configure().buildSessionFactory();
      }
    public static Persistencia getInstancia() throws Exception{
        if(instancia == null)
            instancia = new Persistencia();
        return instancia;
    }
    
    
    public void insert(Object o){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(o);
        session.flush();
        transaction.commit();
        session.close();  
    }
    public void delete(Object o){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(o);
        session.flush();  
        transaction.commit();
        session.close();  
    }
    public void update(Object o){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(o);
        session.flush();  
        transaction.commit();
        session.close();  
    
    }
    public List select(String query){    
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery(query);
        List consulta = q.list();
        session.flush();  
        transaction.commit();
        session.close();
        return consulta;
    }

    public Object selectObj(int chave){
       FabricaEvento agen = new FabricaAgenda();
       Aniversario a1 = agen.criaEventoAniversaio();
       Reuniao r1 = agen.criaEventoReuniao();
       Outroagenda o1 = agen.criaEventoOutroAgenda();
       int cont = 0;
       ArrayList<Aniversario> aniversarios = (ArrayList<Aniversario>)select("Select a from Aniversario a");
       for(Aniversario a: aniversarios)
          if(chave == a.getIdevento()){
            a1 = a;
            cont = 1;
          }
        ArrayList<Reuniao> reunioes = (ArrayList<Reuniao>)select("Select r from Reuniao r");
        for(Reuniao r: reunioes)
           if(chave == r.getIdevento()){
              r1 = r;
              cont =2;
           }
        ArrayList<Outroagenda> outros = (ArrayList<Outroagenda>)select("Select o from Outroagenda o");
        for(Outroagenda o: outros)
           if(o.getIdevento() == chave){
              o1 = o;
              cont =3;
           }
        if(cont == 1)
              return a1;
        if(cont == 2)
           return r1;
        else
           return o1;
    }
    
    public int maxChave(){
       
       int outro = 0;
       int niver = 0;
       int reuniao = 0;
       int maior = 0;
       ArrayList<Aniversario> consultaA = (ArrayList<Aniversario>)select("SELECT a FROM Aniversario a");
       ArrayList<Reuniao> consultaR = (ArrayList<Reuniao>) select("SELECT r FROM Reuniao  r");
       ArrayList<Outroagenda> consultaO = (ArrayList<Outroagenda>) select("SELECT o FROM Outroagenda o");
       
       for(Aniversario a: consultaA)
          if(a.getIdevento()>niver)
             niver = a.getIdevento();
       
       for(Reuniao r: consultaR)
          if(r.getIdevento()>reuniao)
             reuniao = r.getIdevento();
       
       for(Outroagenda o: consultaO)
          if(o.getIdevento()> outro)
             outro = o.getIdevento();
       
       if(niver > reuniao && niver > outro)
          return niver;
       if(reuniao>niver && reuniao > outro)
          return reuniao;
       else
          return outro;
       
       
       
    }
    
    public int maxChaveEst(){
       int prova = 0;
       int trabalho = 0;
       int seminario = 0;
       int maior = 0;
       ArrayList<Trabalho> consultaT = (ArrayList<Trabalho>)select("SELECT t FROM Trabalho t");
       ArrayList<Prova> consultaP = (ArrayList<Prova>) select("SELECT p FROM Prova p");
       ArrayList<Seminario> consultaS = (ArrayList<Seminario>) select("SELECT s FROM Seminario s");
       
       for(Trabalho t: consultaT)
          if(t.getIdevento()>trabalho)
             trabalho = t.getIdevento();
       
       for(Prova p: consultaP)
          if(p.getIdevento()>prova)
             prova = p.getIdevento();
       for(Seminario s: consultaS)
          if(s.getIdevento()> seminario)
             seminario = s.getIdevento();
       
       if(trabalho > prova && trabalho > seminario)
          return trabalho;
       if(prova>trabalho && prova > seminario)
          return prova;
       else
          return seminario;
                  
          
       
    }
    public Object selectObjEst(int chave){
        FabricaEvento e = new FabricaEstudante();
       Trabalho trab = e.criaEventoTrabalho();
       Prova prova = e.criaEventoProva();
       Seminario sem = e.criaEventoSeminario();
      
       
       int cont = 0;
       ArrayList<Trabalho> trabs = (ArrayList<Trabalho>)select("Select t from Trabalho t");
       for(Trabalho t: trabs)
          if(chave == t.getIdevento()){
            trab = t;
            cont = 1;
          }
        ArrayList<Prova> provas = (ArrayList<Prova>)select("Select p from Prova p");
        for(Prova p: provas)
           if(chave == p.getIdevento()){
              prova = p;
              cont =2;
           }
        ArrayList<Seminario> semis = (ArrayList<Seminario>)select("Select s from Seminario s");
        for(Seminario s: semis)
           if(s.getIdevento() == chave){
              sem = s;
              cont =3;
           }
        if(cont == 1)
              return trab;
        if(cont == 2)
           return prova;
        else
           return sem;
    }
    public static void main(String[] args){
       try{
         Persistencia p = new Persistencia().getInstancia();
         int max = p.maxChave();
         
       }catch(Exception e){
       
    }
    }
}



