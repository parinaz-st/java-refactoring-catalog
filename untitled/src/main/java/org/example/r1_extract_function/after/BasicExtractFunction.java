package org.example.r1_extract_function.after;

public class BasicExtractFunction {
    void printOwning(String name, double amount) {
        printBanner();
        printDetails(name, amount);
    }

    private void printDetails(String name, double amount) {
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println(" +-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+\n" +
                " |E|x|t|r|a|c|t| |F|u|n|c|t|i|o|n|\n" +
                " +-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+");
    }

}
