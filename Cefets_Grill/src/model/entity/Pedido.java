package model.entity;
// Bibliotecas

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Pedido {
    private int id_pedido;
    private Cliente cliente;
    private LocalDateTime data_hora_pedido;
    private List<Item_Pedido> itens_pedido = new ArrayList<>();

    // Calcula o valor total do pedido.
    public BigDecimal getvalor_total(){

        BigDecimal total = new BigDecimal(0);

        for (Item_Pedido item : itens_pedido){
            total = total.add(item.calcularSubTotal());
        }

        return total;
    }

    // Construtor.
    public Pedido() {
        // Pega o horario e data atual do sistema, no momento que o pedido foi gerado.
        this.data_hora_pedido = LocalDateTime.now();
    }

    // Getters.
    public int getId_pedido() { return id_pedido; }
    public Cliente getCliente() { return cliente; }
    public LocalDateTime getData_hora_pedido() { return data_hora_pedido; }
    public List<Item_Pedido> getItems_pedido() { return itens_pedido; }

    // Setters.
    public void setId_pedido(int id_pedido) { this.id_pedido = id_pedido; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setItens_pedido(Item_Pedido itens_pedido) { this.itens_pedido.add(itens_pedido); }
}
