package model;
import java.math.BigDecimal;

public class Produto {

    //region Atributos da classe produto.
    private String nomeProduto;
    private int idProduto;
    private BigDecimal precoProduto;
    private int quantidadeProduto;
    //endregion

    //region Construtor da classe produto.
    Produto(String nomeProduto, int idProduto, BigDecimal precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
    //endregion

    //region Getters e setters da classe produto.
    public String getNomeProduto(){ return nomeProduto; } // get Nomeproduto
    public int getIdProduto(){ return idProduto; } // get Idproduto
    public BigDecimal getPrecoProduto(){return precoProduto; } // get Preco
    public BigDecimal getQuantidadeProduto(){ return quantidadeProduto; }


    public void setQuantidadeProduto(int quantidade){ this.quantidadeProduto = quantidade; }
    public void setNomeProduto(String nomeProduto){ this.nomeProduto = nomeProduto; }
    public void setIdProduto(int idProduto){ this.idProduto = idProduto; }
    public void setPrecoProduto(BigDecimal precoProduto){ this.precoProduto = precoProduto; }
    //endregion
}
