// Pacote principal (feriasapp)
package feriasapp;

import feriasapp.model.*;
import feriasapp.service.FeriasService;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador(1, "João", "joao@email.com", 20);
        Gestor gestor = new Gestor(2, "Carla", "carla@email.com");
        RH rh = new RH(3, "Bruno", "bruno@email.com");

        FeriasService feriasService = new FeriasService();

        FeriasSolicitacao solicitacao = feriasService.solicitarFerias(colaborador, "2025-06-01", "2025-06-10");

        if (solicitacao != null) {
            gestor.revisarSolicitacao();
            feriasService.aprovarSolicitacao(solicitacao.getId(), gestor);
        }

        rh.registrarFeriasManual();

        System.out.println("\n--- Resumo da Solicitação ---");
        for (FeriasSolicitacao s : feriasService.listarSolicitacoes()) {
            System.out.println("ID: " + s.getId());
            System.out.println("Colaborador: " + s.getColaborador().getNome());
            System.out.println("Início: " + s.getDataInicio());
            System.out.println("Fim: " + s.getDataFim());
            System.out.println("Status: " + s.getStatus());
            System.out.println("Aprovado por: " + (s.getAprovadoPor() != null ? s.getAprovadoPor().getNome() : "Ninguém"));
            System.out.println("------------------------------");
        }

        System.out.println("\nSaldo de férias restante: " + colaborador.getSaldoFerias() + " dias");
    }
}