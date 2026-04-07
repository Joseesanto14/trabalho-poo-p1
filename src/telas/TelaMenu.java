package telas;

import entidades.Fornecedor;
import java.awt.Font;
import java.util.LinkedList;

/**
 * Tela de Menu principal do sistema.
 */
public class TelaMenu extends javax.swing.JFrame {

    private LinkedList<Fornecedor> listaFornecedor = new LinkedList<>();

    private javax.swing.JLabel lblTitulo;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btFornecedores;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btUsuarios;
    private javax.swing.JButton btSair;

    public TelaMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        lblTitulo = new javax.swing.JLabel();
        btProdutos = new javax.swing.JButton();
        btFornecedores = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        btUsuarios = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        lblTitulo.setText("Menu Principal");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btProdutos.setText("Produtos");
        btProdutos.setFont(new Font("SansSerif", Font.PLAIN, 14));
        btProdutos.addActionListener(this::btProdutosActionPerformed);

        btFornecedores.setText("Fornecedores");
        btFornecedores.setFont(new Font("SansSerif", Font.PLAIN, 14));
        btFornecedores.addActionListener(this::btFornecedoresActionPerformed);

        btClientes.setText("Clientes");
        btClientes.setFont(new Font("SansSerif", Font.PLAIN, 14));
        btClientes.addActionListener(this::btClientesActionPerformed);

        btUsuarios.setText("Usuários");
        btUsuarios.setFont(new Font("SansSerif", Font.PLAIN, 14));
        btUsuarios.addActionListener(this::btUsuariosActionPerformed);

        btSair.setText("Sair");
        btSair.addActionListener(this::btSairActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addComponent(btProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {
        new Principal().setVisible(true);
    }

    private void btFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {
        new CadastroFornecedores(this, listaFornecedor, true).setVisible(true);
    }

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {
        new CadastroClientes().setVisible(true);
    }

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {
        new CadastroUsuarios().setVisible(true);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
