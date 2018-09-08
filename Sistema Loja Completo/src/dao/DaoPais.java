package dao;

import banco.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pojo.Pais;

public class DaoPais {
    public static final String SQL_CONSULTAR = "SELECT * FROM PAIS";
    public static final String SQL_CONSULTAR_ID = "SELECT * FROM PAIS WHERE IDPAIS = ?";

    private Pais pais;

    public DaoPais(Pais pais) {
        this.pais = pais;

    }

    public boolean inserir() {
        try {
            Connection conexao = Banco.getConexao();
            String sql = "INSERT INTO PAIS VALUES(?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, pais.getIdPais());
            ps.setString(2, pais.getNome());
            ps.setString(3, pais.getAtivo());
            ps.execute();
            return true;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Não foi possível incluir Pais");
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
            ps.setInt(1, pais.getIdPais());
//     ps.setString(2, estado.getNome());
//     ps.setString(3, estado.getAtivo());
// tirou essas linhas pq vc só tem 1 ponto de interrogação la em cima
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pais.setNome(rs.getString("NOME"));
                pais.setAtivo(rs.getString("ATIVO"));
            }
            ps.execute();

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Não foi possível consultar Pais");
            se.printStackTrace();

        }
    }
}
