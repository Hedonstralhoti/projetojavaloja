package telas;

import componentes.MeuCampoTexto;
import componentes.MeuComboBox;
import dao.DaoEstado;
import javax.swing.JOptionPane;
import pojo.Estado;

public class TelaCadastroEstado extends TelaCadastro{
    private Estado estado = new Estado();
    private DaoEstado daoEstado = new DaoEstado(estado);
    private MeuCampoTexto campoIdEstado = new MeuCampoTexto(10, true,"Código");
    private MeuCampoTexto campoNome = new MeuCampoTexto(50, false, "Nome");
    private MeuCampoTexto campoSigla = new MeuCampoTexto(2, false, "Sigla");
    private MeuCampoTexto campoAtivo = new MeuCampoTexto(1, false, "Ativo");
    private MeuComboBox campoPais = new MeuComboBox(new String[]{"Brasil", "Paraguay"}, false, "Pais");
        
    
    public TelaCadastroEstado(){
        super("Cadastro de Estado");
        
        
        adicionaComponente(1 ,1 ,1 ,2 , campoIdEstado);
        adicionaComponente(2 ,1 ,1 ,3 , campoNome);
        adicionaComponente(3 ,1 ,1 ,1 , campoSigla);
        adicionaComponente(4 ,1 ,1 ,1 , campoAtivo);
        adicionaComponente(5 ,1 ,1 ,1 , campoPais);
        habilitaCampos(false);

       pack();

    }
    @Override
    public void incluirBD(){
        estado.setId(Integer.parseInt(campoIdEstado.getText()));
        estado.setNome(campoNome.getText());
        estado.setSigla(campoSigla.getText());
        estado.setAtivo(campoAtivo.getText());
        daoEstado.inserir();
    }
    
    @Override
    public void consultar(){
        super.consultar();
        new TelaConsulta("Consulta de Estados", new String[] {"Código", "Nome", "Sigla", "Ativo"},
                DaoEstado.SQL_CONSULTAR, this
        
        );
    }
    @Override
    public void preencherDados(int id){
        estado.setId(id);
        daoEstado.consultar();
        campoIdEstado.setText(""+ estado.getId());
        campoNome.setText(estado.getNome());
        campoSigla.setText(estado.getSigla());
        campoAtivo.setText(estado.getAtivo());
    }
}
