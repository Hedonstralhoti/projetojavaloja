package telas;

import componentes.MeuCampoTexto;

public class TelaCadastroProduto extends TelaCadastro {
    
    private MeuCampoTexto campoidProduto = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(50, false, "Nome");
    private MeuCampoTexto campoQuantidade = new MeuCampoTexto(5, false, "Quantidade");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(2, false, "Ativo");
    private MeuCampoTexto campoidEstacao = new MeuCampoTexto(5, false, "Estação");
    private MeuCampoTexto campoidCor = new MeuCampoTexto(5, false, "Cor");
    
    public TelaCadastroProduto() {
        super("Produto");
        
        adicionaComponente(1, 1, 1, 2, campoidProduto);
        adicionaComponente(2, 1, 1, 3, campoNome);
        adicionaComponente(3, 1, 1, 3, campoQuantidade);
        adicionaComponente(4, 1, 1, 1, campoAtivo);
        adicionaComponente(5, 1, 1, 1, campoidEstacao);
        adicionaComponente(6, 1, 1, 1, campoidCor);
        habilitaCampos(false);

        pack();
    }
    
}
