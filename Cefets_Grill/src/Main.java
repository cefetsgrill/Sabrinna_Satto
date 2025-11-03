import model.entity.*;
import view.Menu;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Scanner utilizado para entrada do usuário.
	    Scanner scan = new Scanner(System.in);
	    // Objeto da classe carrinho para armazenar os produtos.
	    Carrinho carrinho = new Carrinho();
	    // Objeto da classe menu para chamar os menus.
	    Menu menu = new Menu();
	
	    // Variável opção para o usuário escolher.
	    int opcaoPrincipal = -1;
	
	    // Loop para printar os menus até o usuário desejar sair do cardápio.
	    while (opcaoPrincipal != 0) {
	        // Chamada do menu para o cardápio.
	        menu.menuInicial();
	
	        // Opção que o usuário irá entrar com.
	        System.out.print("Escolha sua opção principal: ");
	        opcaoPrincipal = scan.nextInt();
	
	        // Condicional para a navegação entre menus.
	        switch (opcaoPrincipal) {
	            case 0:
	                System.out.println("Obrigado pelos pedidos, volte sempre.");
	                break;
	            case 1:
	                processarPedidoPizza(scan, menu, carrinho);
	                break;
	            case 2:
	                processarPedidoOmeletes(scan, menu, carrinho);
	                break;
	            case 3:
	                processarPedidoHamburguer(scan, menu,carrinho);
	                break;
	            case 4:
	                carrinho.mostrarCarrinho();
	                break;
	            case 5:
	                processarCompra(scan, menu,carrinho);
	                break;
	            default:
	                System.out.println("Opção Inválida.");
	                break;
	        }
	    }

	}


// Funcionalidades para aprimorar a modularização, separando todos os switchs para evitar o main de ficar gigantesco.
public static void processarPedidoPizza(Scanner scan, Menu menu, Carrinho carrinho) {
    menu.pizzaSubMenu();
    System.out.print("Digite sua opção: ");
    int opcaoSubMenu = scan.nextInt();
    int quantidade = 0;
    switch (opcaoSubMenu) {
        case 0:
            System.out.println(">>>> Voltando ao menu principal.......");
            break;
        case 1:
            System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto pizzaCalabresa = new Produto("Pizza de Calabresa",101,BigDecimal.valueOf(62.99));
            carrinho.adicionarProduto(pizzaCalabresa, quantidade);
            System.out.println(">>>>>>>>>>>> Pizza de calabresa adicionada ao carrinho.");
            break;
        case 2:
        	System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto pizzaPortuguesa = new Produto("Pizza Portuguesa",102,BigDecimal.valueOf(67.99));
            carrinho.adicionarProduto(pizzaPortuguesa, quantidade);
            System.out.println(">>>>>>>>>>>> Pizza de portuguesa adicionada ao carrinho.");
            break;
        case 3:
            System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto pizzaHavaina = new Produto("Pizza Havaiana",103,BigDecimal.valueOf(69.99));
            carrinho.adicionarProduto(pizzaHavaina, quantidade);
            System.out.println(">>>>>>>>>>>> Pizza Havaina adicionada ao carrinho.");
            break;
        default:
            System.out.println(">>>>>>>>>>>> Sabor de pizza inválido!");
            break;
    }
}

public static void processarPedidoOmeletes(Scanner scan, Menu menu, Carrinho carrinho) {
    menu.omeleteSubMenu();
    IO.print("Digite sua opção: ");
    int opcaoSubMenu = scan.nextInt();
    int quantidade = 0;
    switch (opcaoSubMenu) {
        case 0:
            System.out.println(">>>> Voltando ao menu principal.......");
            break;
        case 1:
            System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto omeletePresunto = new Produto("Omelete de Presunto",201,BigDecimal.valueOf(16.99));
            carrinho.adicionarProduto(omeletePresunto, quantidade);
            System.out.println(">>>>>>>> Omelete de presunto adicionado ao carrinho. ");
            break;
        case 2:
            System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto omeleteQueijo = new Produto("Omelete de Queijo",202,BigDecimal.valueOf(17.99));
            carrinho.adicionarProduto(omeleteQueijo, quantidade);
            System.out.println(">>>>>>>> Omelete de queijo adicionado ao carrinho. ");
            break;
        case 3:
            System.out.println("Qual quantidade você deseja? ");
            quantidade = scan.nextInt();
            Produto omeletePresuntoQueijo = new Produto("Omelete de Presunto e Queijo",203,BigDecimal.valueOf(19.00));
            carrinho.adicionarProduto(omeletePresuntoQueijo, quantidade);
            System.out.println(">>>>>>>> Omelete de presunto e queijo adicionado ao carrinho. ");
            break;
        default:
            System.out.println(">>>>>>>>> Sabor de omelete inválido!");
            break;
    }
}

public static void processarPedidoHamburguer(Scanner scan, Menu menu, Carrinho carrinho) {
    menu.hamburguerSubMenu();
    System.out.print("Digite sua opção: ");
    int opcaoSubMenu = scan.nextInt();
    int quantidade = 0;
    String entrada;
    switch (opcaoSubMenu) {
        case 0:
            System.out.println(">>>> Voltando ao menu principal.......");
            break;
        case 1:
            System.out.println("Qual quantidade você deseja? ");

            quantidade = scan.nextInt();

            Produto xBacon = new Produto("X-Bacon",301, BigDecimal.valueOf(32.99));
            carrinho.adicionarProduto(xBacon, quantidade);
            System.out.print(">>>>>>>> X-Bacon adicionado ao carrinho. ");
            break;
        case 2:
            System.out.println("Qual quantidade você deseja? ");

            quantidade = scan.nextInt();

            Produto xTudo = new Produto("X-Tudo",302, BigDecimal.valueOf(42.99));
            carrinho.adicionarProduto(xTudo, quantidade);
            System.out.println(">>>>>>>> X-Tudo adicionado ao carrinho. ");
            break;
        case 3:
            System.out.println("Qual quantidade você deseja? ");

            quantidade = scan.nextInt();

            Produto xEgg = new Produto("X-Egg",303, BigDecimal.valueOf(30.99));
            carrinho.adicionarProduto(xEgg, quantidade);
            System.out.println(">>>>>>>> X-Egg adicionado ao carrinho. ");
            break;
        default:
            System.out.println(">>>>>>>>> Hamburguer inválido!");
            break;
    }
}

public static void processarCompra(Scanner scan,Menu menu, Carrinho carrinho) {
    menu.finalizarCompraSubMenu();
    System.out.print("Digite sua opção: ");
    int opcaoSubMenu = scan.nextInt();
    // Criação do obbjeto metodoPagamento para definição da forma de pagar.
    Pix pix = new Pix();
    Cartao cartao = new Cartao();

    switch (opcaoSubMenu) {
        case 1:
            pix.processarPagamento(carrinho.calcularPrecototal());
            carrinho.limparCarrinho();
            break;
        case 2:
            int teste = 0, parcelas=0;

            while(teste==0)
            {
                System.out.println("Quantas parcelas? (1 a 12, taxa de 5%)");
                parcelas = scan.nextInt();

                if(parcelas >= 1 && parcelas <= 12)
                    teste = 1;
                else
                    System.out.println("Quantidade de parcelas inválidas!");
            }

            cartao.processarPagamentoCartao(carrinho.calcularPrecototal(), 1.05, parcelas);
            break;
        default:
            System.out.println("Opção inválida.");
            break;
    }

}
}

