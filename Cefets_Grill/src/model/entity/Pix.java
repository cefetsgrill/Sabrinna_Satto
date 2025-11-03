package model.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Pix extends MetodoPagamento {
    @Override
    public void processarPagamento(BigDecimal valorTotal) {

        // Cria uma chave pix utilizando a biblioteca UUID do java que gera uma chave aleatória em cada novo pagamento.
        UUID chavePix = UUID.randomUUID();

        // Converte a chave de UUID para string para facilitar manipulação.
        String chavePixStr = chavePix.toString();

        // Printa a chave pix para o usuário copiar e utiliza-la como forma de pagamento e o valor da compra.
        System.out.println("Chave Pix: " + chavePixStr);
        System.out.println("Valor total: " + valorTotal);

        // Printa que o pagamento foi feito com sucesso.
        try{
            // Gera um sleep/delay de 2 segundos para fingir um processamento do pagamento.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ocorreu um erro durante o processo.......");
            e.printStackTrace();
        }

        System.out.println("Pagamento concluido com sucesso.");

    }
}
