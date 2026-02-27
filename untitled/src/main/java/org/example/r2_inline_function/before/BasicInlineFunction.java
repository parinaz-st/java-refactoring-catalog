package org.example.r2_inline_function.before;

public class BasicInlineFunction {
    public int getRating(Driver driver) {
        return moreThanFileLateDeliveries(driver);
    }

    private int moreThanFileLateDeliveries(Driver driver) {
        return (driver.getNumberOfLateDeliveries() > 5) ? 2 : 1;
    }

}
