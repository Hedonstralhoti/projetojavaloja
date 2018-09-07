package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
    public static JDesktopPane jdp = new JDesktopPane();
    public JMenu jmCadastros = new JMenu("Cadastros");
    public JMenu jmMovimentos = new JMenu("Movimentos");
    public JMenu jmRelatorios = new JMenu("Relatorios");
    public JMenuItem jmiPais = new JMenuItem("Pais");
    public JMenuItem jmiEstado = new JMenuItem("Estado");
    public JMenuItem jmiCidade = new JMenuItem("Cidade");
    public JMenuItem jmiEmpresa = new JMenuItem("Empresa");
    public JMenuItem jmiRepresentante = new JMenuItem("Representante");
    public JMenuItem jmiCompra = new JMenuItem("Compra");
    public JMenuBar jmb = new JMenuBar();
    
    

    public TelaSistema() {
        setTitle("Sistema Comercial");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(jdp);
        setJMenuBar(jmb);
        
        

        jmb.add(jmCadastros);
        jmb.add(jmMovimentos);
        jmb.add(jmRelatorios);
        
        adicionaItemMenu(jmCadastros, jmiPais);
        adicionaItemMenu(jmCadastros, jmiEstado);
        adicionaItemMenu(jmCadastros, jmiCidade);
        adicionaItemMenu(jmCadastros, jmiEmpresa);
        adicionaItemMenu(jmCadastros, jmiRepresentante);
        adicionaItemMenu(jmMovimentos, jmiCompra);
    
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
        }
        if (ae.getSource() == jmiRepresentante) {
            TelaCadastroRepresentante telaRepresentante = new TelaCadastroRepresentante();
        }
        if (ae.getSource() == jmiPais) {
            TelaCadastroPais telaPais = new TelaCadastroPais();
        }
        if (ae.getSource() == jmiEstado) {
            TelaCadastroEstado telaEstado = new TelaCadastroEstado();
        }
        else if (ae.getSource() == jmiCidade) {
            TelaCadastroCidade telaCidade = new TelaCadastroCidade();
        }
        else if (ae.getSource() == jmiCompra) {
            TelaCadastroCompra telaCompra = new TelaCadastroCompra();
        }
    }
}
