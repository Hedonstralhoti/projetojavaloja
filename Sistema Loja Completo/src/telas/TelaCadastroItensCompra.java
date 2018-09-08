package telas;

import componentes.MeuCampoTexto;

public class TelaCadastroItensCompra extends TelaCadastro{
    
    private MeuCampoTexto campoidItensCompra = new MeuCampoTexto(10, true, "Código");
    private MeuCampoTexto campoQuantidade = new MeuCampoTexto(50, false, "Quantidade");
    private MeuCampoTexto campoValorCusto = new MeuCampoTexto(20, false, "Valor de Custo");
    private MeuCampoTexto campoValorVenda = new MeuCampoTexto(20, false, "Valor de Venda ");
    private MeuCampoTexto campoidCompra = new MeuCampoTexto(1, false, "Compra");
    private MeuCampoTexto campoidProduto = new MeuCampoTexto(1, false, "Produto");
    
    public TelaCadastroItensCompra() {
        super("Cadastro de Itens de Compra");
        
        adicionaComponente(1, 1, 1, 2, campoidItensCompra);
        adicionaComponente(2, 1, 1, 3, campoQuantidade);
        adicionaComponente(3, 1, 1, 3, campoValorCusto);
        adicionaComponente(4, 1, 1, 3, campoValorVenda);
        adicionaComponente(5, 1, 1, 3, campoidCompra);
        adicionaComponente(6, 1, 1, 3, campoidProduto);
        habilitaCampos(false);

        pack();
        
    }
    
}
