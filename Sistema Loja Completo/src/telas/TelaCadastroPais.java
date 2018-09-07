
package telas;

import componentes.MeuCampoTexto;
import componentes.MeuComboBox;


public class TelaCadastroPais extends TelaCadastro{
    private MeuCampoTexto campoIdPais = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(80, false, "Nome");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
        
    
    public TelaCadastroPais(){
        super("Cadastro de Pais");
        
        adicionaComponente(1 ,1 ,1 ,2 , campoIdPais);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,1 , campoAtivo);
        habilitaCampos(false);

       pack();

    }
}

