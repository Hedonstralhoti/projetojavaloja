package pojo;

public class Empresa {
    private int idEmpresa;
    private String nome;
    private String cnpj;
    private String endereco;
    private int num_endereco;
    private String telefone;
    private String celular;
    private String ativo;
    private Representante idRepresentante = new Representante();
    private Cidade idCidade = new Cidade();

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum_endereco() {
        return num_endereco;
    }

    public void setNum_endereco(int num_endereco) {
        this.num_endereco = num_endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Representante getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(Representante idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }
    
}
