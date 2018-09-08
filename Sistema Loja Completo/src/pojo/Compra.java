package pojo;

public class Compra {
    private int idCompra;
    private String dataCompra;
    private String acrescimo;
    private String desconto;
    private String valor;
    private Empresa idEmpresa = new Empresa();
    private Representante idRepresentante = new Representante();

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(String acrescimo) {
        this.acrescimo = acrescimo;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Representante getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(Representante idRepresentante) {
        this.idRepresentante = idRepresentante;
    }
    
    
}
