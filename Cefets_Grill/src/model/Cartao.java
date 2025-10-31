package model;

public class Cartao extends MetodoPagamento
{
    @Override
    void processarPagamentoCartao(double valorTotal, double taxa, int parcelas)
    {
        double total = valorTotal * taxa; // * 1.15? não sei se aplica o valor do desconto à vista

        double parcela = total/parcelas;

        System.out.println(String.format("Valor total da compra: %.2f", total));
        System.out.println(String.format("Parcelado em " + parcelas + " vezes"));
        System.out.println(String.format("Valor da parcela: %.2f", parcela));

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
