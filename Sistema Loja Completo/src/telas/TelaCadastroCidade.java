package telas;

import componentes.MeuCampoTexto;

import javax.swing.JLabel;

public class TelaCadastroCidade extends TelaCadastro{
    private MeuCampoTexto campoidCidade = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(50, false, "Nome");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
    private MeuCampoTexto campoidEstado = new MeuCampoTexto(5, false, "Estado");
        
    
    public TelaCadastroCidade(){
        super("Cadastro de Cidade");
        
        adicionaComponente(1 ,1 ,1 ,2 , campoidCidade);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,3 , campoAtivo);
        adicionaComponente(4 ,1 ,1 ,1 , campoidEstado);
        habilitaCampos(false);

       pack();

    }
}
