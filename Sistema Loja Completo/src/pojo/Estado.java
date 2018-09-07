
package pojo;


public class Estado {
    private int idEstado;
    private String nome;
    private String sigla;
    private String ativo;
    private Pais pais = new Pais();

    public int getId() {
        return idEstado;
    }

    public void setId(int id) {
        this.idEstado = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}
