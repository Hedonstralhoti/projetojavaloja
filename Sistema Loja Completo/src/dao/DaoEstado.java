package dao;

import banco.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pojo.Estado;


public class DaoEstado {
    public static final String SQL_CONSULTAR = "SELECT * FROM ESTADO"; 
    public static final String SQL_CONSULTAR_ID = "SELECT * FROM ESTADO WHERE IDESTADO = ?";
    
    private Estado estado;
    public DaoEstado(Estado estado){
        this.estado = estado;
    
}
    public boolean inserir(){
        try{
     Connection conexao = Banco.getConexao();
     String sql = "INSERT INTO ESTADO VALUES(?,?,?,?)";
     PreparedStatement ps = conexao.prepareStatement(sql); 
     ps.setInt(1, estado.getIdEstado());
     ps.setString(2, estado.getNome());
     ps.setString(3,estado.getSigla());
     ps.setString(4, estado.getAtivo());
     ps.execute();
     return true;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Não foi possível incluir Estado");
            se.printStackTrace();
            return false;
        }
    }
    public boolean alterar(){
        return true;
    }
    public boolean excluir(){
        return true;
    }
    public void consultar(){
        try{
     Connection conexao = Banco.getConexao();
     PreparedStatement ps = conexao.prepareStatement(SQL_CONSULTAR_ID); 
     ps.setInt(1, estado.getIdEstado());
//     ps.setString(2, estado.getNome());
//     ps.setString(3,estado.getSigla());
//     ps.setString(4, estado.getAtivo());
// tirou essas linhas pq vc só tem 1 ponto de interrogação la em cima
     ResultSet rs = ps.executeQuery();
     if(rs.next()){
         estado.setNome(rs.getString("NOME_ESTADO"));
         estado.setSigla(rs.getString("SIGLA"));
         estado.setAtivo(rs.getString("ATIVO"));
     }
     ps.execute();
     
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Não foi possível consultar Estado");
            se.printStackTrace();
            
        }
    }  
        
}
