package pojo;

public class ItensCompra {
    private int idItensCompra;
    private String quantidade;
    private String valorCusto;
    private String valorVenda;
    private Compra idCompra = new Compra();
    private Produto idProduto = new Produto();

    public int getIdItensCompra() {
        return idItensCompra;
    }

    public void setIdItensCompra(int idItensCompra) {
        this.idItensCompra = idItensCompra;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }
}
