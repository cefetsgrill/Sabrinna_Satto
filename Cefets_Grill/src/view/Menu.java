package view;
public class Menu {
    public void menuInicial(){
        System.out.println("===================== CARDAPIO =====================");
        System.out.println("===================== 1. Pizza =====================");
        System.out.println("===================== 2. Omelete =====================");
        System.out.println("===================== 3. Hamburguer =====================");
        System.out.println("==================== 4. Carrinho =====================");
        System.out.println("==================== 5. Finalizar Compra =====================");
        System.out.println("===================== 0. Sair =====================");
    }
    public void pizzaSubMenu(){
        System.out.println("===================== PIZZAS =====================");
        System.out.println("===================== 1. Calabresa - R$62.99 =====================");
        System.out.println("===================== 2. Portuguesa - R$67.99 =====================");
        System.out.println("===================== 3. Havaiana  - R$ 69.99=====================");
        System.out.println("===================== 0. Sair =====================");
    }
    public void omeleteSubMenu(){
        System.out.println("===================== OMELETES =====================");
        System.out.println("===================== 1. Presunto - R$16.99 =====================");
        System.out.println("===================== 2. Queijo - R$17.99 =====================");
        System.out.println("===================== 3. Presunto e Queijo - R$19.00 =====================");
        System.out.println("===================== 0. Sair =====================");
    }
    public void hamburguerSubMenu(){
        System.out.println("===================== HAMBURGUER =====================");
        System.out.println("===================== 1. X-Bacon - R$32.99 =====================");
        System.out.println("===================== 2. X-Tudo - R$42.99 =====================");
        System.out.println("===================== 3. X-Egg - R$30.99 =====================");
        System.out.println("===================== 0. Sair =====================");
    }
    public void finalizarCompraSubMenu(){
        System.out.println("===================== METODO DE PAGAMENTO =====================");
        System.out.println("===================== 1. PIX =====================");
        System.out.println("===================== 2. Cartão - 5% de taxa =====================");
        System.out.println("===================== 0. Sair =====================");
    }
}
