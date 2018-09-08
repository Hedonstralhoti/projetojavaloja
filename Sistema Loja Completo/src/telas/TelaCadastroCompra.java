package telas;

import componentes.MeuCampoTexto;

public class TelaCadastroCompra extends TelaCadastro{
    
    private MeuCampoTexto campoidCompra = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoDataCompra = new MeuCampoTexto(50, false, "Data da Compra");
    private MeuCampoTexto campoAcrescimo = new MeuCampoTexto(20, false, "Acrescimo");
    private MeuCampoTexto campoDesconto = new MeuCampoTexto(20, false, "Desconto");
    private MeuCampoTexto campoValor = new MeuCampoTexto(20, false, "Valor");
    private MeuCampoTexto campoidEmresa = new MeuCampoTexto(1, false, "Empresa");
    private MeuCampoTexto campoidRepresentante = new MeuCampoTexto(1, false, "Representante");
    
    public TelaCadastroCompra() {
        super("Cadastro de Compra");
        
        adicionaComponente(1 ,1 ,1 ,2 , campoidCompra);
        adicionaComponente(2 ,1 ,1 ,3 , campoDataCompra);
        adicionaComponente(3 ,1 ,1 ,3 , campoAcrescimo);
        adicionaComponente(4 ,1 ,1 ,3 , campoDesconto);
        adicionaComponente(5 ,1 ,1 ,3 , campoValor);
        adicionaComponente(6 ,1 ,1 ,3 , campoidEmresa);
        adicionaComponente(7 ,1 ,1 ,3 , campoidRepresentante);
        habilitaCampos(false);

        pack();
        
    }
    
}
