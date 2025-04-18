// feriasapp.model.Gestor.java
package feriasapp.model;

public class Gestor extends Usuario {
    public Gestor(int id, String nome, String email) {
        super(id, nome, email, "GESTOR");
    }

    public void revisarSolicitacao() {
        System.out.println("Gestor revisando solicitação de férias...");
    }
}


