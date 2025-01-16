package se.lexicon;

public class CurrencyExchange {
    // Exchange rates (example rates, these should be updated periodically)
    private static final double SEK_TO_USD = 0.10;
    private static final double SEK_TO_EURO = 0.09;
    private static final double USD_TO_SEK = 10.0;
    private static final double USD_TO_EURO = 0.85;
    private static final double EURO_TO_SEK = 11.0;
    private static final double EURO_TO_USD = 1.18;

    public double convertCurrency(int choice, double amount) {
        switch (choice) {
            case 1: // SEK to USD
                return amount * SEK_TO_USD;
            case 2: // SEK to Euro
                return amount * SEK_TO_EURO;
            case 3: // USD to SEK
                return amount * USD_TO_SEK;
            case 4: // USD to Euro
                return amount * USD_TO_EURO;
            case 5: // Euro to SEK
                return amount * EURO_TO_SEK;
            case 6: // Euro to USD
                return amount * EURO_TO_USD;
            default:
                return -1; // Invalid choice
        }
    }
}
