
package model;


public class FabricaEstudante implements FabricaEvento {

    public Trabalho criaEventoTrabalho() {
        return new Trabalho();
    }

    public Prova criaEventoProva() {
        return new Prova();
    }

    public Seminario criaEventoSeminario() {
        return new Seminario();
    }

    public Outroestudante criaEventoOutroEst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Aniversario criaEventoAniversaio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Reuniao criaEventoReuniao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Outroagenda criaEventoOutroAgenda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Deposito criaEventoDeposito() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Conta criaEventoConta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Compra criaEventoCompra() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Outrofinanceiro criaEventoOutroFin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
