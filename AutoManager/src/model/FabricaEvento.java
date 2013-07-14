
package model;


public interface FabricaEvento {
    Trabalho criaEventoTrabalho();
    Prova criaEventoProva();
    Seminario criaEventoSeminario();
    Outroestudante criaEventoOutroEst();
    Aniversario criaEventoAniversaio();
    Reuniao criaEventoReuniao();
    Outroagenda criaEventoOutroAgenda();
    Deposito criaEventoDeposito();
    Conta criaEventoConta();
    Compra criaEventoCompra();
    Outrofinanceiro criaEventoOutroFin();
    
}
