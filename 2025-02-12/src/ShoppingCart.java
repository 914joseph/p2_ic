import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> products = new ArrayList<Product>();

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
    }

    public void addProduct() {
        String productName = "1";
        double productPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e o preço dos produtos que deseja adicionar ao carrinho " + customerID
                + ":\ndigite -1 para finalizar a lista.");
        while (!productName.equals("-1")) {
            System.out.println("Nome:");
            productName = scanner.nextLine();
            if (productName.equals("-1")) {
                break;
            }
            System.out.println();
            System.out.println("Preco:");
            productPrice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            products.add(new Product(productName, productPrice));
        }
        // scanner.close();

    }

    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        if (products.size() == 0) {
            System.out.println("Carrinho vazio");
            // scanner.close();
            return;
        } else {
            System.out.println("Digite o número ao lado do produto a ser removido:");
            for (int i = 0; i < products.size(); i++) {
                System.out.println("[" + i + "] " + products.get(i).getbrand() + " - R$" + products.get(i).getPrice());
            }
            int operator = scanner.nextInt();
            products.remove(operator);
            System.out.println("Produto removido com sucesso");
        }
        // scanner.close();

    }

    public String getContents() {
        if (products.size() == 0) {
            return "Carrinho vazio";
        } else {

            String finall = "";
            for (int i = 0; i < products.size(); i++) {
                finall += "[" + products.get(i).getbrand() + ";R$" + products.get(i).getPrice() + "]\n";
            }
            return finall;
        }

    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount() {
        return products.size();
    }

    public double getTotalPrice() {
        if (products.size() == 0) {
            return 0;
        } else {
            double totalPrice = 0;
            for (int i = 0; i < products.size(); i++) {
                totalPrice += products.get(i).getPrice();
            }
            return totalPrice;
        }
    }

}
