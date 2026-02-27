package org.example.r1_extract_function.before;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExtractMethodReassignLocalVarTest {
    @Test
    public void ExtractMethodNoVarOutOfScope_smoke_test() {
        ExtractFunctionReassineLocalVar extractMethod = new ExtractFunctionReassineLocalVar();
        Invoice invoice = new Invoice();
        Customer customer = new Customer("parinaz");
        invoice.setOrders(populateOrderList());
        invoice.setCustomer(customer);
        extractMethod.printOwning(invoice);
    }

    private List<Order> populateOrderList() {
        List<Order> orderList = new ArrayList<>();
        Order order1 = new Order(1000);
        Order order2 = new Order(2000);
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
    }
}
