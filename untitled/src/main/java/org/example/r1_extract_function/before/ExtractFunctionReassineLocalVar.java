package org.example.r1_extract_function.before;

import java.util.Date;

public class ExtractFunctionReassineLocalVar {
    public void printOwning(Invoice invoice) {
        int outstanding = 0;
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");

        // calculate outstanding
        for (Order order : invoice.getOrders()) {
            outstanding += order.getAmount();
        }
        //record due date
        Date today = new Date();
        invoice.setDueDate(new Date(today.getYear(), today.getMonth(), today.getDay() + 30));

        //print details
        System.out.println("name: " + invoice.getCustomer().getName());
        System.out.println("amount: " + outstanding);
        System.out.println("due: " + invoice.getDueDate());
    }

}
