package com.bridgelabz;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static int findIntMax(Integer x, Integer y,Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    private static Float findFlotMax(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Finding the Maximum number from given numbers:");
        System.out.println("Enter 3 Integer numbers: ");
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        //findMax(x,y,z);
        System.out.println("Max: "+findIntMax(x,y,z));
        System.out.println("Enter 3 Floating point numbers");
        Float a = scanner.nextFloat();
        Float b = scanner.nextFloat();
        Float c = scanner.nextFloat();
        System.out.println("Max: "+findFlotMax(a,b,c));

    }
}
