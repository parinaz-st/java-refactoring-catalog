package org.example.r2_inline_function.before;

import java.util.ArrayList;
import java.util.List;

public class InlineFunctionWithStatementMovement {
    public List<String[]> reportLines(Customer customer) {
        List<String[]> lines = new ArrayList<>();
        gatherCustomerData(lines, customer);
        return lines;
    }

    private void gatherCustomerData(List<String[]> out, Customer customer) {
        out.add(new String[]{"name", customer.getName()});
        out.add(new String[]{"location", customer.getLocation()});
    }
}
