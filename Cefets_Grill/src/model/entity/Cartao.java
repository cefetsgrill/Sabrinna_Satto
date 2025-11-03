package model.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cartao extends MetodoPagamento
{
    @Override
    public void processarPagamentoCartao(BigDecimal valorTotal, double taxa, Integer parcelas)
    {
        BigDecimal total = valorTotal.multiply(BigDecimal.valueOf(taxa)); // * 1.15? não sei se aplica o valor do desconto à vista

        BigDecimal parcela = total.divide(BigDecimal.valueOf(parcelas), 2, RoundingMode.CEILING);

        System.out.println(String.format("Valor total da compra: %.2f", total.doubleValue()));
        System.out.println(String.format("Parcelado em " + parcelas + " vezes"));
        System.out.println(String.format("Valor da parcela: %.2f", parcela.doubleValue()));

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Ocorreu um erro durante o processo.......");
            e.printStackTrace();
        }

        System.out.println("Pagamento concluido com sucesso.");
    }
}
