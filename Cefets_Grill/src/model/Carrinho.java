package model;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Carrinho {
    // Lista que irá ser o carrinho, tendo o tipo da classe produto para que possa ter nome, id e preço. Nessa ordem.
    List<Produto> carrinho = new ArrayList<>();

    // Metodo para adicionar produto na array list
    public void adicionarProduto(Produto produto){
        carrinho.add(produto);
    }
    public void limparCarrinho(){
        carrinho.clear();
    }

    // Metodo que calcula o preco total do carrinho de maneira modularizada.
    public BigDecimal calcularPrecototal(){
        BigDecimal precoTotal = new BigDecimal(0.00);
        for(Produto item : carrinho){
            precoTotal = precoTotal.add(item.getPrecoProduto().multiply(item.getQuantidadeProduto()) ;
        }
        return precoTotal;
    }

    public void mostrarCarrinho(){
        System.out.println("--------------- CARRINHO ------------------ ");
        for(Produto item : carrinho){
            double subTotal = item.getPrecoProduto() * item.getQuantidadeProduto();
            // Printando o carrinho utilizando o loop for-each, a cada instância mostrando um produto diferente.
            System.out.println("Id: " + item.getIdProduto());
            System.out.println("Nome: " + item.getNomeProduto());
            System.out.printf("Valor Unitário: %.2f\n", item.getPrecoProduto());
            System.out.println("Quantidade: " + item.getQuantidadeProduto());
            System.out.printf("Subtotal: %.2f\n", subTotal);
            System.out.println("-------------------------------------------------");
        }
        System.out.printf("Valor total do carrinho: %.2f\n", calcularPrecototal());
    }

}
