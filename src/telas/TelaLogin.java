package telas;

import entidades.Usuario;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 * Tela de Login do sistema.
 */
public class TelaLogin extends javax.swing.JFrame {

    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JButton btEntrar;

    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        lblTitulo = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblTitulo.setText("Sistema de Gestão");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblUsername.setText("Usuário");
        lblSenha.setText("Senha");

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(this::btEntrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addComponent(txtSenha)))
                    .addComponent(btEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = txtUsername.getText().trim();
        String senha = new String(txtSenha.getPassword());

        for (Usuario u : GerenciadorUsuarios.listaUsuarios) {
            if (u.getUsername().equals(usuario) && u.getSenha().equals(senha)) {
                dispose();
                new TelaMenu().setVisible(true);
                return;
            }
        }

        JOptionPane.showMessageDialog(this,
                "Usuário ou senha inválidos.",
                "Erro de Login",
                JOptionPane.ERROR_MESSAGE);
        txtSenha.setText("");
    }
}
