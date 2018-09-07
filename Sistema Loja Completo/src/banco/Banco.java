
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Banco {
    //nunca colocar um bloco try e deixar um catch em branco
    
    
    public static Connection getConexao(){
        try{
        Class.forName("org.firebirdsql.jdbc.FBDriver");
        Connection conexao = DriverManager.getConnection("jdbc:firebirdsql://127.0.0.1:3050/C:/BANCO3.FDB","SYSDBA", "masterkey");
        return conexao;
    }
        
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Problema com o Driver");
            return null;
        }
        catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Problema de conexão com o Banco" + "de Dados");
            return null;
        }
    }
    public static List<String[]> consultaBanco(String sql){
        List<String []> retorno =new ArrayList();
        try{
            Statement st = getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);//resultado de uma consulta
            while (rs.next()){//enquanto retornar o rs.next(result next) continua fazendo
                String[] linha = new String[rs.getMetaData().getColumnCount()];
                for (int coluna = 1; coluna <= rs.getMetaData().getColumnCount();coluna ++){
                    linha[coluna - 1] = rs.getString(coluna);
                }
                retorno.add(linha);
            }
            return retorno;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar o Banco de Dados");
            e.printStackTrace();
            return null;
        }
    }    
}

//acesso do bd usando jdbc