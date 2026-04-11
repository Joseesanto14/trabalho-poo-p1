package entidades;

/**
 *
 * @author joseelias14
 */
public class Produto {
    private String descricao;
    private Double preco;
    private Integer quantidade;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return descricao + " | R$ " + preco + " | " + fornecedor.getNome();
    }
    
}
