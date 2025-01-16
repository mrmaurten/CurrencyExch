package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
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

                double exchangedAmount = exchange.convertCurrency(choice, amount);
                if (exchangedAmount != -1) {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.printf("Exchanged Amount: %.2f\n", exchangedAmount);
                    System.out.println("Conversion completed on: " + dtf.format(now));
                } else {
                    System.out.println("Invalid conversion choice.");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int getValidChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 7) {
                    return choice;
                } else {
                    System.out.print("Please enter a valid option (1-7): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number (1-7): ");
            }
        }
    }

    private static double getValidAmount(Scanner scanner) {
        while (true) {
            try {
                double amount = Double.parseDouble(scanner.nextLine());
                if (amount >= 0) {
                    return amount;
                } else {
                    System.out.print("Amount cannot be negative. Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric value: ");
            }
        }
    }
}
