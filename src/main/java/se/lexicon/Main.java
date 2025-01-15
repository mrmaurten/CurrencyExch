
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyExchange exchange = new CurrencyExchange();
        boolean running = true;

        while (running) {
            System.out.println(" --Welcome to the Currency Exchange!-- ");
            System.out.println("1. Exchange SEK to USD");
            System.out.println("2. Exchange SEK to EUR");
            System.out.println("3. Exchange USD to SEK");
            System.out.println("4. Exchange USD to EUR");
            System.out.println("5. Exchange EUR to SEK");
            System.out.println("6. Exchange EUR to USD");
            System.out.println("7. Exit the exchange");
            System.out.print("Choose an option (1-7): ");

            int choice = getValidChoice(scanner);

            if (choice == 7) {
                System.out.println("Exiting the program. Thanks and goodbye!");
                running = false;
            } else {
                System.out.println("Enter the amount:");
                double amount = getValidAmount(scanner);
                double convertedAmount = converter.convertCurrency(choice, amount);
                if (convertedAmount != -1) {
            }
            }


        }
}
