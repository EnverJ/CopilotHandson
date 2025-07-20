package org.example;

public class Calculator {
    public double result;

    public void calResult(char m, double x, double z) {
        switch (m) {
            case 'a':
                System.out.println(result = x + z);
                break;
            case 's':
                System.out.println(result = x - z);
                break;
            case 'd':
                System.out.println(result = x / z);
                break;
            case 'm':
                System.out.println(result = x * z);
                break;
            default:
                System.out.println("invalid operations");

        }
        System.out.println("result = " + result);
    }

}
