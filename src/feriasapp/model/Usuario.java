// feriasapp.model.Usuario.java
package feriasapp.model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String role;

    public Usuario(int id, String nome, String email, String role) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.role = role;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}