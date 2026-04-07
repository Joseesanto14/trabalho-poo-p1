package telas;

import entidades.Usuario;
import java.util.LinkedList;

/**
 * Gerencia a lista de usuários compartilhada entre TelaLogin e CadastroUsuarios.
 */
public class GerenciadorUsuarios {

    public static final LinkedList<Usuario> listaUsuarios = new LinkedList<>();

    static {
        Usuario admin = new Usuario();
        admin.setUsername("admin");
        admin.setSenha("admin123");
        admin.setEmail("admin@sistema.com");
        admin.setNivel("Administrador");
        listaUsuarios.add(admin);
    }
}
