package model;

import java.util.ArrayList;
import java.util.List;
import model.Item_Pedido;

public class repositorioItemPedido
{
    private List<Item_Pedido> itens = new ArrayList<>();

    public void adicionar(Item_Pedido item)
    {
        itens.add(item);
    }

    public List<Item_Pedido> listar()
    {
        return itens;
    }

    public Item_Pedido buscarPorId(int id)
    {
        for (Item_Pedido item : itens)
        {
            if (item.getId_itemPedido() == id)
            {
                return item;
            }
        }
        return null;
    }

    public boolean atualizar(int id, Item_Pedido novosDados)
    {
        for (int i = 0; i < itens.size(); i++)
        {
            if (itens.get(i).getId_itemPedido() == id)
            {
                itens.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id)
    {
        return itens.removeIf(i -> i.getId_itemPedido() == id);
    }
}
