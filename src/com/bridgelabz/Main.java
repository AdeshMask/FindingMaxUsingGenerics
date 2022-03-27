package com.bridgelabz;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int findMax(Integer x, Integer y,Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        else if (z.compareTo(max)>0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Finding the Maximum number from given numbers:");
        System.out.println("Enter 3 numbers: ");
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        //findMax(x,y,z);
        System.out.println("Max: "+findMax(x,y,z));
    }

}
