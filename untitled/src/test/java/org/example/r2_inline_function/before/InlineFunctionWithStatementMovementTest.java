package org.example.r2_inline_function.before;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InlineFunctionWithStatementMovementTest {
    InlineFunctionWithStatementMovement inlineFunction = new InlineFunctionWithStatementMovement();

    @Test
    public void returnsCustomerNameAndLocationLines() {
        Customer customer = new Customer("Parinaz", "Tehran");
        List<String[]> result = inlineFunction.reportLines(customer);
        assertEquals(2, result.size());
        assertEquals("name", result.get(0)[0]);
        assertEquals("Parinaz", result.get(0)[1]);
        assertEquals("location", result.get(1)[0]);
        assertEquals("Tehran", result.get(1)[1]);
    }
}
