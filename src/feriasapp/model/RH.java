// src/feriasapp/model/RH.java
package feriasapp.model;

public class RH extends Usuario {

    public RH(int id, String nome, String email) {
        super(id, nome, email, "RH");
    }

    public void registrarFeriasManual() {
        System.out.println("RH registrando férias manualmente no sistema.");
    }
}