import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart(01);
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        while (operation != 5) {
            System.out.println(
                    "Digite a operação\n1- Adicionar produto\n2- Remove produto\n3- Listar produtos\n4- Listar preço total do carrinho\n5- Encerrar programa");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    cart.addProduct();
                    break;
                case 2:
                    cart.removeProduct();
                    break;
                case 3:
                    System.out.println(cart.getContents());
                    break;
                case 4:
                    System.out.println("Total: " + cart.getTotalPrice());
                    break;
                case 5:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
        }
        scanner.close();

    }
}
