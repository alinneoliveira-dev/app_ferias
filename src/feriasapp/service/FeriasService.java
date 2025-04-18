// feriasapp.service.FeriasService.java
package feriasapp.service;

import feriasapp.model.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class FeriasService {
    private List<FeriasSolicitacao> solicitacoes = new ArrayList<>();

    public FeriasSolicitacao solicitarFerias(Colaborador colaborador, String inicio, String fim) {
        LocalDate dataInicio = LocalDate.parse(inicio);
        LocalDate dataFim = LocalDate.parse(fim);
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);

        if (dias <= colaborador.getSaldoFerias()) {
            FeriasSolicitacao solicitacao = new FeriasSolicitacao(colaborador, dataInicio, dataFim);
            solicitacoes.add(solicitacao);
            colaborador.reduzirSaldo((int) dias);
            return solicitacao;
        } else {
            System.out.println("Solicitação negada: saldo de férias insuficiente.");
            return null;
        }
    }

    public void aprovarSolicitacao(int id, Usuario aprovador) {
        for (FeriasSolicitacao s : solicitacoes) {
            if (s.getId() == id) {
                s.aprovar(aprovador);
                System.out.println("Solicitação aprovada por " + aprovador.getNome());
                return;
            }
        }
        System.out.println("Solicitação não encontrada.");
    }

    public List<FeriasSolicitacao> listarSolicitacoes() {
        return solicitacoes;
    }
}