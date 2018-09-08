package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
    public static JDesktopPane jdp = new JDesktopPane();
    public JMenu jmCadastros = new JMenu("Cadastros");
    public JMenuItem jmiPais = new JMenuItem("Pais");
    public JMenuItem jmiEstado = new JMenuItem("Estado");
    public JMenuItem jmiCidade = new JMenuItem("Cidade");
    public JMenuItem jmiEmpresa = new JMenuItem("Empresa");
    public JMenuItem jmiRepresentante = new JMenuItem("Representante");
    public JMenuItem jmiCompra = new JMenuItem("Compra");
    public JMenuItem jmiItensCompra = new JMenuItem("Itens de Compra");
    public JMenuItem jmiProduto = new JMenuItem("Produto");
    public JMenuItem jmiEstacao = new JMenuItem("Estação");
    public JMenuItem jmiCor = new JMenuItem("Cor");
    public JMenuBar jmb = new JMenuBar();
    
    

    public TelaSistema() {
        setTitle("Sistema Comercial");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(jdp);
        setJMenuBar(jmb);
        jdp.setBackground(new java.awt.Color(192,192,192));
        
        jmb.add(jmCadastros);
        
        
        adicionaItemMenu(jmCadastros, jmiPais);
        adicionaItemMenu(jmCadastros, jmiEstado);
        adicionaItemMenu(jmCadastros, jmiCidade);
        adicionaItemMenu(jmCadastros, jmiEmpresa);
        adicionaItemMenu(jmCadastros, jmiRepresentante);
        adicionaItemMenu(jmCadastros, jmiCompra);
        adicionaItemMenu(jmCadastros, jmiItensCompra);
        adicionaItemMenu(jmCadastros, jmiProduto);
        adicionaItemMenu(jmCadastros, jmiEstacao);
        adicionaItemMenu(jmCadastros, jmiCor);
    
        setVisible(true);
    }    
    public void adicionaItemMenu (JMenu menu, JMenuItem itemMenu){
        menu.add(itemMenu);
        itemMenu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiEmpresa) {
            TelaCadastroEmpresa telaEmpresa = new TelaCadastroEmpresa();
        }else if (ae.getSource() == jmiRepresentante) {
            TelaCadastroRepresentante telaRepresentante = new TelaCadastroRepresentante();
        }else if (ae.getSource() == jmiPais) {
            TelaCadastroPais telaPais = new TelaCadastroPais();
        }else if (ae.getSource() == jmiEstado) {
            TelaCadastroEstado telaEstado = new TelaCadastroEstado();
        }else if (ae.getSource() == jmiCidade) {
            TelaCadastroCidade telaCidade = new TelaCadastroCidade();
        }else if (ae.getSource() == jmiCompra) {
            TelaCadastroCompra telaCompra = new TelaCadastroCompra();
        }else if(ae.getSource() == jmiItensCompra){
            TelaCadastroItensCompra telaItemCompra = new TelaCadastroItensCompra();
        }else if(ae.getSource() == jmiProduto){
            TelaCadastroProduto telaProduto = new TelaCadastroProduto();
        }else if(ae.getSource() == jmiEstacao){
            TelaCadastroEstacao telaEstacao = new TelaCadastroEstacao();
        }else if(ae.getSource() == jmiCor){
            TelaCadastroCor telaCor = new TelaCadastroCor();
        }
    }
}
