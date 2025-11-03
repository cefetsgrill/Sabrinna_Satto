package model.entity;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Carrinho {

    // Lista que irá ser o carrinho, tendo o tipo da classe item+pedido para que possa ter nome, id e preço. Nessa ordem.
    List<Item_Pedido> carrinho = new ArrayList<>();

    // Metodo para adicionar produto na array list
    public void adicionarProduto(Produto produto, int quantidade){
        for(Item_Pedido item : carrinho){
            if(item.getProduto().getIdProduto() == produto.getIdProduto()){
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println(">>> Quantidade de " + produto.getNomeProduto() + " atualizada.");
                return;
            }
        }
        Item_Pedido item = new Item_Pedido();

        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setPreco(produto.getPrecoProduto());

        this.carrinho.add(item);
        System.out.println(">>> " + produto.getNomeProduto() + " adicionado ao carrinho.");
    }
    public void limparCarrinho(){ this.carrinho.clear(); }

    // Metodo que calcula o preco total do carrinho de maneira modularizada.
    public BigDecimal calcularPrecototal(){
        BigDecimal precoTotal = BigDecimal.ZERO;
        for(Item_Pedido item : carrinho){
           precoTotal = precoTotal.add(item.calcularSubTotal());;
        }
        return precoTotal;
    }

    public void mostrarCarrinho(){
        System.out.println("--------------- CARRINHO ------------------ ");
        if(carrinho.isEmpty()){
            System.out.println("O carrinho está vazio.");
        }

        for(Item_Pedido item : carrinho){
            // Printando o carrinho utilizando o loop for-each, a cada instância mostrando um produto diferente.
            System.out.println("Id: " + item.getProduto().getIdProduto());
            System.out.println("Nome: " + item.getProduto().getNomeProduto());
            System.out.printf("Valor Unitário: %.2f\n", item.getPreco().doubleValue());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.printf("Subtotal: %.2f\n", item.calcularSubTotal().doubleValue());
            System.out.println("-------------------------------------------------");
        }
        System.out.printf("Valor total do carrinho: %.2f\n", calcularPrecototal().doubleValue());
    }

}
