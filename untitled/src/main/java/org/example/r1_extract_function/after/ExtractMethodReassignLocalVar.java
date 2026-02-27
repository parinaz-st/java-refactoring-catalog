package org.example.r1_extract_function.after;

import java.util.Date;
import java.util.List;

public class ExtractMethodReassignLocalVar {
    void printOwning(Invoice invoice) {
        printBanner();
        int outstanding = calculateOutstanding(invoice.getOrders());
        recordDueDate(invoice);
        printInvoiceDetails(invoice, outstanding);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");

    }

    private void printInvoiceDetails(Invoice invoice, int outstanding) {
        System.out.println("name:" + invoice.getCustomer().getName());
        System.out.println("amount: " + outstanding);
        System.out.println("due: " + invoice.getDueDate());
    }

    private int calculateOutstanding(List<Order> lstOrder) {
        int result = 0;
        for (Order order : lstOrder) {
            result += order.getAmount();
        }
        return result;
    }

    private void recordDueDate(Invoice invoice) {
        Date today = new Date();
        invoice.setDueDate(new Date(today.getYear(), today.getMonth(), today.getDay() + 30));
    }


}
