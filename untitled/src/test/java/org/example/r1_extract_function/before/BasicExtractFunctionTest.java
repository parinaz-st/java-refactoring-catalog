package org.example.r1_extract_function.before;

import org.junit.jupiter.api.Test;

public class BasicExtractFunctionTest {
    @Test
    void printOwning_smoke_test() {
        BasicExtractFunction extractMethod = new BasicExtractFunction();
        String name = "Parinaz";
        double amount = 1000;
        extractMethod.printOwning(name,amount);
    }

}
