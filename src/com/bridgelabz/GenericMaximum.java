package com.bridgelabz;

public class GenericMaximum<T extends Comparable <T>>{
  
    public <T extends Comparable<T>> T findMax(T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        GenericMaximum max = new GenericMaximum();
        System.out.println("Maximum of 3 Integer numbers: ");
        Integer aInt = 10,bInt = 32,cInt = 211;
        System.out.println("Maximum of 3 Integer array is: "+max.findMax(aInt,bInt,cInt));
        Float pFloat = 12.0f,qFloat = 43.7f,rFloat = 54.0f;
        System.out.println("Maximum of 3 Integer array is: "+max.findMax(pFloat,qFloat,rFloat));
        String str1 = "Apple",str2 =  "Peach",str3 =  "Banana";
        System.out.println("Maximum of 3 Integer array is: "+max.findMax(str1,str2,str3));
    }
}
