
package componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;


public class MeuCampoTexto extends JTextField implements MeuComponente {
    private boolean obrigatorio;
    private String dica;
    
    public MeuCampoTexto(int colunas, boolean obrigatorio, String dica){
        super(colunas);
        this.obrigatorio = obrigatorio;
        this.dica = dica;
          addFocusListener(new FocusListener(){
            public void focusLost(FocusEvent fe){
                setBackground(Color.white);
            }
            public void focusGained(FocusEvent fe){
                setBackground(Color.yellow);
            }
        });
        
    }

    @Override
    public void limpar() {
        setText("");
    }

    @Override
    public void habilitar(boolean status) {
        setEnabled(status);
    }

    @Override
    public boolean eObrigatorio() {
        return obrigatorio;
    }
    @Override
    public boolean eValido() {
        return true;
    }

    @Override
    public boolean eVazio() {
        return getText().trim().isEmpty();
        //String texto = getText();
//        String textoSemEspacos = texto.trim;
//        boolean vazio = textoSemEspacos.isEmpty();
//        return vazio.
    }

    @Override
    public String getDica() {
        return dica;
    }
    
}
