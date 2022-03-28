package com.bridgelabz;

public class GenericMaximum<T extends Comparable <T>>{

    public <T extends Comparable> T findMax(T x,T y,T z,T n){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        if (n.compareTo(max) > 0)
            max = n;
        printMax(x,y,z,n,max);
        return max;
    }
    public static <T> void printMax(T x,T y,T z,T n,T max){
        System.out.printf("Max of %s, %s, %s, %s is:: ",x,y,z,n,max);
    }
    public static void main(String[] args) {
        GenericMaximum max = new GenericMaximum();
        Integer aInt = 10,bInt = 32,cInt = 211, dInt = 45;
        System.out.println(max.findMax(aInt,bInt,cInt,dInt));
        Float pFloat = 12.0f,qFloat = 43.7f,rFloat = 54.0f,sFloat = 39.90f;
        System.out.println(max.findMax(pFloat,qFloat,rFloat, sFloat));
        String str1 = "Apple",str2 =  "Peach",str3 =  "Banana", str4 = "Pineapple";
        System.out.println(max.findMax(str1,str2,str3,str4));
    }
}
