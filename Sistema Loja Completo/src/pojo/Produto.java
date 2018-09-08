package pojo;

public class Produto {
    private int idProduto;
    private String nome;
    private String quantidade;
    private String ativo;
    private Estacao idEstacao = new Estacao();
    private Cor idCor = new Cor();

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Estacao getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(Estacao idEstacao) {
        this.idEstacao = idEstacao;
    }

    public Cor getIdCor() {
        return idCor;
    }

    public void setIdCor(Cor idCor) {
        this.idCor = idCor;
    }
}
