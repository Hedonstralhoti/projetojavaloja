package telas;

import componentes.MeuCampoTexto;


public class TelaCadastroEmpresa extends TelaCadastro{
    
    private MeuCampoTexto campoIdEmpresa = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(80, true, "Nome");
    private MeuCampoTexto campoCNPJ = new MeuCampoTexto(11, true, "CNPJ");
    private MeuCampoTexto campoEndereco = new MeuCampoTexto(80, false, "Endereço");
    private MeuCampoTexto camponum_Endereco = new MeuCampoTexto(8, false, "Numero Endereço");
    private MeuCampoTexto campoTelefone = new MeuCampoTexto(10, true, "Telefone");
    private MeuCampoTexto campoCelular = new MeuCampoTexto(11, false, "Celular");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
    private MeuCampoTexto campoidRepresentante = new MeuCampoTexto(10, false, "Representante");
    private MeuCampoTexto campoidCidade = new MeuCampoTexto(10, false, "Cidade");
   
        
    
    public TelaCadastroEmpresa(){
        super("Cadastro de Empresa");
        
        
        adicionaComponente(1 ,1 ,1 ,2 , campoIdEmpresa);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,1 , campoCNPJ);
        adicionaComponente(4 ,1 ,1 ,1 , campoEndereco);
        adicionaComponente(5 ,1 ,1 ,1 , camponum_Endereco);
        adicionaComponente(6 ,1 ,1 ,1 , campoTelefone);
        adicionaComponente(7 ,1 ,1 ,1 , campoCelular);
        adicionaComponente(8 ,1 ,1 ,1 , campoAtivo);
        
        habilitaCampos(false);

       pack();

    }
}