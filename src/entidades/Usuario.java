package entidades;

/**
 *
 * @author joseelias14
 */
public class Usuario {
    private String username;
    private String email;
    private char[] senha;
    private NivelAcesso nivel;
    
    public Usuario() {}

    public Usuario(String username, String email, char[] senha, NivelAcesso nivel) {
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

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return username + " - " + nivel;
    }
    
    
}
