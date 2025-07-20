package org.example;

public class Multi {

    public static boolean checkBol() {
        boolean a = true;
        boolean b = false;
        if(a==b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static void checkColor (String color)
    {
        switch (color)
        {
            case "Red":
                System.out.println("Red");
                break;
            case "Yellow":
                System.out.println("Yellow");
                break;
            case "Green":
                System.out.println("Green");
                break;
            default:
                System.out.println("Color not identified");
                break;
        }
    }

    public static void lookColor(String color)
    {
        switch (color.toLowerCase())
        {
            case "red" -> System.out.println("Red");
            case "yellow"-> System.out.println("Yellow");
            case "green" -> System.out.println("Green");
            default -> System.out.println("Color not identified");
        }
    }

    public static void main(String[] args) {
        String multi ="""
            this is
            3
            line
            and 
            4 line
            I 
            am 
            using 
            java 17
            """;

        System.out.println(multi);

        System.out.println(checkBol());
        checkColor("Redb");
        lookColor("blue");


    }
}
