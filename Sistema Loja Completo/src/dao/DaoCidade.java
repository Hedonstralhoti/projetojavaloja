package dao;

import banco.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pojo.Cidade;

public class DaoCidade {
    public static final String SQL_CONSULTAR = "SELECT * FROM CIDADE";
    public static final String SQL_CONSULTAR_ID = "SELECT * FROM PAIS WHERE IDCIDADE = ?";

    private Cidade cidade;

    public DaoCidade(Cidade cidade) {
        this.cidade = cidade;

    }

    public boolean inserir() {
        try {
            Connection conexao = Banco.getConexao();
            String sql = "INSERT INTO CIDADE VALUES(?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cidade.getIdCidade());
            ps.setString(2, cidade.getNome());
            ps.setString(3, cidade.isAtivo());
            ps.execute();
            return true;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Não foi possível incluir Cidade");
            se.printStackTrace();
            return false;
        }
    }

    public boolean alterar() {
        return true;
    }

    public boolean excluir() {
        return true;
    }

    public void consultar() {
        try {
            Connection conexao = Banco.getConexao();
            PreparedStatement ps = conexao.prepareStatement(SQL_CONSULTAR_ID);
            ps.setInt(1, cidade.getIdCidade());
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cidade.setNome(rs.getString("NOME"));
                cidade.setAtivo(rs.getString("ATIVO"));
            }
            ps.execute();

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Não foi possível consultar Cidade");
            se.printStackTrace();

        }
    }
}
