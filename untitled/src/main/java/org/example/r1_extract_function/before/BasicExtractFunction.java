package org.example.r1_extract_function.before;

public class BasicExtractFunction {
    void printOwning(String name, double amount) {
        printBanner();

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println(" +-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+\n" +
                " |E|x|t|r|a|c|t| |F|u|n|c|t|i|o|n|\n" +
                " +-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+");
    }
}
