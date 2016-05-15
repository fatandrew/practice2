package com.company;

/**
 * Created by User on 15.05.2016.
 */
public class SetZero {
    public int set(int num, int i){
        char[] maskArray = new char[32];
        for(int j=0;j<32;j++){
            if(j==32-i) maskArray[j]='0';
            else maskArray[j]='1';
        }
        String maskString = new String(maskArray);
        Long mask = Long.parseLong(maskString,2);
        return num & mask.intValue();

    }
}
