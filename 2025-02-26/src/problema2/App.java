package problema2;

import java.util.Scanner;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numbervar = sc.nextInt();
            System.out.print("Holder: ");
            String holdervar = sc.nextLine();
            holdervar = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balancevar = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimitvar = sc.nextDouble();
            System.out.println();
            Account account = new Account(numbervar, holdervar, balancevar, withdrawLimitvar);
            System.out.print("Enter amount for withdraw: ");
            double withdrawValue = sc.nextDouble();
            if (withdrawValue > account.getWithdrawLimit()) {
                throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
            } else if (withdrawValue > account.getBalance()) {
                throw new IllegalArgumentException("Withdraw error: Not enough balance");
            } else {
                account.withdraw(withdrawValue);
                System.out.println("New balance: " + account.getBalance());
            }
            sc.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
