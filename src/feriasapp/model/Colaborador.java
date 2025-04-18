// feriasapp.model.Colaborador.java
package feriasapp.model;

public class Colaborador extends Usuario {
    private int saldoFerias;

    public Colaborador(int id, String nome, String email, int saldoFerias) {
        super(id, nome, email, "COLABORADOR");
        this.saldoFerias = saldoFerias;
    }

    public int getSaldoFerias() { return saldoFerias; }

    public void reduzirSaldo(int dias) {
        if (dias > 0 && dias <= saldoFerias) {
            saldoFerias -= dias;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
