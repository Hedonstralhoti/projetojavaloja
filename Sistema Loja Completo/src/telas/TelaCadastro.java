package telas;

import componentes.MeuComponente;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaCadastro extends JInternalFrame implements ActionListener {
    private final int PADRAO = 0;
    private final int INCLUINDO = 1;
    private final int ALTERANDO = 2;
    private final int EXCLUINDO = 3;
    private final int CONSULTANDO = 4;
    private int estadoTela=PADRAO;
    private boolean temDadosNaTela = false;
    
    protected JPanel jpComponentes = new JPanel();
    private JPanel jpBotoes = new JPanel();
    private JButton jbIncluir = new JButton("Incluir");
    private JButton jbAlterar = new JButton("Alterar");
    private JButton jbExcluir = new JButton("Excluir");
    private JButton jbConsultar = new JButton("Consultar");
    private JButton jbConfirmar = new JButton("Confirmar");
    private JButton jbCancelar = new JButton("Cancelar");
    private List<MeuComponente> campos = new ArrayList();
    
    
    public TelaCadastro(String titulo){
        super(titulo, true, true, false, false);
        getContentPane().add("Center", jpComponentes);
        getContentPane().add("South", jpBotoes);
        jpBotoes.setLayout(new GridLayout(1 , 6));
        adicionarBotoes();
        jpComponentes.setLayout(new GridBagLayout());
        pack();
        setVisible(true);
        TelaSistema.jdp.add(this);
        habilitaBotoes();
        
    }
    
    public void adicionaComponente(int linha, int coluna, int linhas, int colunas,MeuComponente componente){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = coluna;
        gbc.gridy = linha;
        String texto = componente.getDica();
        if (componente.eObrigatorio()){
            texto ="<html><body>"+ texto +"<font color=\"red\">*</font>: ";
            
        }else
        texto = texto + ":  ";
        JLabel rotulo = new JLabel(texto);
        gbc.anchor = GridBagConstraints.WEST;
        jpComponentes.add(rotulo, gbc);
        gbc.gridx++;
        gbc.gridwidth = colunas;
        gbc.gridheight = linhas;
        jpComponentes.add((JComponent) componente, gbc);
        campos.add(componente);
    }
    
    public void adicionarBotoes(){
        adicionarBotao(jbIncluir);
        adicionarBotao(jbAlterar);
        adicionarBotao(jbExcluir);
        adicionarBotao(jbConsultar);
        adicionarBotao(jbConfirmar);
        adicionarBotao(jbCancelar);
    }
    public void adicionarBotao(JButton botao){
        jpBotoes.add(botao);
        botao.addActionListener(this);
    }
        
    public void habilitaBotoes(){
        System.out.println(">>>");
        //aqui ele etá comparando estado de tela se ele é padrão ou não, vai retornar true ou flse
        jbIncluir.setEnabled(estadoTela == PADRAO);
        //tem dados na tela ja é logico pois ele ja é bollean então ele está se auto comparando
        jbAlterar.setEnabled(estadoTela == PADRAO && temDadosNaTela);
        jbExcluir.setEnabled(estadoTela == PADRAO && temDadosNaTela);
        jbConsultar.setEnabled(estadoTela == PADRAO);
        jbConfirmar.setEnabled(estadoTela != PADRAO);
        jbCancelar.setEnabled(estadoTela != PADRAO);  
        
    }
     public void habilitaCampos(boolean status) {
        for(int i = 0; i < campos.size(); i++){
            campos.get(i).habilitar(status);
        }
        
    }
    
    public void limpaCampos() {
        for(int i = 0; i < campos.size(); i++){
            campos.get(i).limpar();
        }
        
    }
    
    public boolean verificaCampos(){
        String errosObrigatorios = "";
        String errosValidacao ="";
        for(int i = 0; i < campos.size(); i++){
            if(campos.get(i).eObrigatorio()&& campos.get(i).eVazio()){
                errosObrigatorios = errosObrigatorios + campos.get(i).getDica() + "\n";
            }
            if(!campos.get(i).eValido()){
               errosValidacao = errosValidacao + campos.get(i).getDica() +"\n";
            }
        }
        if (!errosObrigatorios.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Campos obrigatórios não preenchidos: \n \n"+errosObrigatorios);
            
        }if (!errosObrigatorios.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Campos obrigatórios não preenchidos: \n \n"+errosValidacao);
        }
        return errosObrigatorios.isEmpty() && errosValidacao.isEmpty();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jbIncluir){
            incluir();
        }
        else if(ae.getSource() == jbAlterar){
            alterar();
        }
        else if(ae.getSource() == jbExcluir){
            excluir();
        }
        else if(ae.getSource() == jbConsultar){
            consultar();
        }
        else if(ae.getSource()== jbConfirmar){
            confirmar();
        }
        
        else if(ae.getSource() == jbCancelar){
            cancelar();
        } else {
            System.out.println("Fonte de actionListiner não reconhecida");
        }
        
        
    }
    public void incluir(){
    estadoTela = INCLUINDO;
    limpaCampos();
    habilitaCampos(true);
    habilitaBotoes();
    }
    public void alterar(){
    estadoTela = ALTERANDO;
    habilitaCampos(true);
    habilitaBotoes();
    }
    public void excluir(){
    estadoTela = EXCLUINDO;
    habilitaBotoes();
    }
    public void consultar(){
    estadoTela = CONSULTANDO;
    
    habilitaBotoes();
    }
    
    public void confirmar() {
        if (!verificaCampos()){
            return;
        }
        if(estadoTela == INCLUINDO){
            incluirBD();
            temDadosNaTela = true;
        }
        if(estadoTela == EXCLUINDO){
            int opcao = JOptionPane.showConfirmDialog(this, "Deseha excluir realmente?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(opcao == JOptionPane.YES_OPTION){
                limpaCampos();
                temDadosNaTela = false;
            }
            temDadosNaTela = true;
        }
        estadoTela = PADRAO;
        habilitaCampos(false);
        habilitaBotoes();
    }
    
    public void cancelar(){
    estadoTela = PADRAO;
    limpaCampos();
    habilitaCampos(false);
    habilitaBotoes();
    }
    public void incluirBD(){
        //Este metodo será redefinido nas subsclasses.
    }
    
    public void preencherDados(int id){
        //Este metodo será redefinido nas subsclasses.isso se chama polimrfismo
    }
    

}


