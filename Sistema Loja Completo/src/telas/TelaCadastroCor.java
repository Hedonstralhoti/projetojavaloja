package telas;

import componentes.MeuCampoTexto;

public class TelaCadastroCor extends TelaCadastro{
    
    private MeuCampoTexto campoidCor = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(50, false, "Nome");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
    
    public TelaCadastroCor() {
        super("Cadastro de Cor");
        
        adicionaComponente(1 ,1 ,1 ,2 , campoidCor);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,3 , campoAtivo);
        habilitaCampos(false);

        pack();
        
    }
    
}
