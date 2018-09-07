
package pojo;

public class Cidade {
    private int idCidade;
    private String nome;
    private String ativo;
    private Estado estado = new Estado();

    public int getId() {
        return idCidade;
    }

    public void setId(int id) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String isAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
  
}

