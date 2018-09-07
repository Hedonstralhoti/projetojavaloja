
package telas;

import componentes.MeuCampoTexto;
import componentes.MeuComboBox;
import dao.DaoEstado;
import pojo.Estado;


public class TelaCadastroRepresentante extends TelaCadastro{
    
    private MeuCampoTexto campoIdRepresentante = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(80, true, "Nome");
    private MeuCampoTexto campoCPF = new MeuCampoTexto(11, true, "CPF");
    private MeuCampoTexto campoTelefone = new MeuCampoTexto(10, true, "Telefone");
    private MeuCampoTexto campoCelular = new MeuCampoTexto(11, false, "Celular");
    private MeuCampoTexto campoEmail = new MeuCampoTexto(11, false, "Email");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
   
        
    
    public TelaCadastroRepresentante(){
        super("Cadastro de Representate");
        
        
        adicionaComponente(1 ,1 ,1 ,2 , campoIdRepresentante);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,1 , campoCPF);
        adicionaComponente(4 ,1 ,1 ,1 , campoTelefone);
        adicionaComponente(5 ,1 ,1 ,1 , campoCelular);
        adicionaComponente(6 ,1 ,1 ,1 , campoEmail);
        adicionaComponente(7 ,1 ,1 ,1 , campoAtivo);
        
        habilitaCampos(false);

       pack();

    }
}