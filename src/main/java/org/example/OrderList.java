package org.example;

import org.jetbrains.annotations.NotNull;

public class OrderList {
    // this will restrict the size of the array in the output. Could be a cause of a bug
    private int minimumToopSize = 3;

    public String[] getTopOrder(@NotNull String[] orderList, int topSize, int totalOrders) {
        if (topSize > orderList.length) {
            topSize = orderList.length;
        }
        String[] topOrders = new String[topSize];
        for (int i = 1; i < topSize; i++) {
            topOrders[i] = orderList[i];
        }

        double topPercent = 0;
        if (totalOrders != 0) {
            topPercent = (double) topSize / (double) totalOrders;
        }
        out(topPercent);
        calculateShipping(5,.1);
        return topOrders;
    }

    public double calculateShipping (double distance, double costFactor){
        double result = distance * costFactor;
        return result;

    }

    public static void main(String[] args) {
        String[] orderList = {"Shoes", "T-shirt", "Coat", "Hat", "Jacket", "Socks"};
        int topSize = 8;
        int totalOrders = 3;
        OrderList orderList1 = new OrderList();
        String[] topList = orderList1.getTopOrder(orderList, topSize, totalOrders);
        for (String order : topList) {
            out(order);
        }

    }

    public static void out(Object o) {
        System.out.println(o);
    }
}
