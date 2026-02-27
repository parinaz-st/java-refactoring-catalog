package org.example.r2_inline_function.after;

import org.example.r2_inline_function.before.BasicInlineFunction;
import org.example.r2_inline_function.before.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicInlineFunctionTest {
   BasicInlineFunction basicInlineFunction = new BasicInlineFunction();

    @Test
    public void returns2WhenLateDeliveriesExceedFive() {
       Driver driver = new Driver(10);
        assertEquals(2, basicInlineFunction.getRating(driver));
    }

    @Test
    public void returns1WhenLateDeliveriesAreLessThanFive() {
        Driver driver = new Driver(1);
        assertEquals(1, basicInlineFunction.getRating(driver));
    }
    @Test
    public void returns1WhenLateDeliveriesAreFive(){
       Driver driver = new Driver(5);
        assertEquals(1, basicInlineFunction.getRating(driver));
    }
}
