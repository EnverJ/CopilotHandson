package org.example;

public class OutBoundProcess {
    public void assignCarrier(boolean freeShipping) {
        if (freeShipping == true) {
            out("Use special carrier");
        } else {
            out("Use regular carrier");
        }
        recordShippingCharge(freeShipping);
    }

    public void recordShippingCharge(boolean freeShipping) {
        if (!freeShipping) {
            out("Add $5 shipping fee");
        } else {
            out("No shipping fee");
        }

    }

    public static void out(Object o) {
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        OutBoundProcess outBoundProcess = new OutBoundProcess();
        boolean assignCarrier = true;
        outBoundProcess.assignCarrier(assignCarrier);
    }
}
