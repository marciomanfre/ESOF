

package model;


public class FabricaAgenda implements FabricaEvento {

    public Trabalho criaEventoTrabalho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Prova criaEventoProva() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Seminario criaEventoSeminario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Outroestudante criaEventoOutroEst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Aniversario criaEventoAniversaio() {
        return new Aniversario();
    }

    public Reuniao criaEventoReuniao() {
        return new Reuniao();
    }

    public Outroagenda criaEventoOutroAgenda() {
        return new Outroagenda();
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
