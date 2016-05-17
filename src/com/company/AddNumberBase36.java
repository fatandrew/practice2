package com.company;

public class AddNumberBase36 {

    public String add(String a, String b) {

        int a1=Integer.parseInt(a);

        int b1=Integer.parseInt(b);
        int sum = a1+b1;
        String sum1 = Integer.toString(sum, 36);
        return sum1;
    }
}