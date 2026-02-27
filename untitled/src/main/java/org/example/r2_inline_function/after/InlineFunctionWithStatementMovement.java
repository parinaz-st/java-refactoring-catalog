package org.example.r2_inline_function.after;

import java.util.ArrayList;
import java.util.List;

public class InlineFunctionWithStatementMovement {
    public List<String[]> reportLines(Customer customer) {
        List<String[]> lines = new ArrayList<>();
        lines.add(new String[]{"name", customer.getName()});
        lines.add(new String[]{"location", customer.getLocation()});
        return lines;
    }

}
