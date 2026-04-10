package entidades;

/**
 *
 * @author joseelias14
 */
public class Usuario {
    private String username;
    private String email;
    private char[] senha;
    private String nivel;
    
    public Usuario() {}

    public Usuario(String username, String email, char[] senha, String nivel) {
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.nivel = nivel;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return username + " - " + nivel;
    }
    
    
}
