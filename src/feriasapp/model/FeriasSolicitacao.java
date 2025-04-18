// feriasapp.model.FeriasSolicitacao.java
package feriasapp.model;

import java.time.LocalDate;

public class FeriasSolicitacao {
    private static int contador = 1;

    private int id;
    private Colaborador colaborador;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String status;
    private Usuario aprovadoPor;

    public FeriasSolicitacao(Colaborador colaborador, LocalDate inicio, LocalDate fim) {
        this.id = contador++;
        this.colaborador = colaborador;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.status = "PENDENTE";
    }

    public int getId() { return id; }
    public Colaborador getColaborador() { return colaborador; }
    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public String getStatus() { return status; }
    public Usuario getAprovadoPor() { return aprovadoPor; }

    public void aprovar(Usuario aprovador) {
        this.status = "APROVADO";
        this.aprovadoPor = aprovador;
    }
}