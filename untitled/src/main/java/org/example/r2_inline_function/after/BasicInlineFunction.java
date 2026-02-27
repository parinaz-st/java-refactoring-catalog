package org.example.r2_inline_function.after;

import org.example.r2_inline_function.before.Driver;

public class BasicInlineFunction {
    public int getRating(Driver driver) {
        return (driver.getNumberOfLateDeliveries() > 5) ? 2 : 1;
    }
}
