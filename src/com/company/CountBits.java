package com.company;

/**
 * Created by User on 15.05.2016.
 */
public class CountBits {
    public int count(int num){
        int counter =0;
        while (num!=0){
            counter++;
            num = num & (num - 1);
        }
        return counter;
    }
}
