package com.company;

/**
 * Created by User on 14.05.2016.
 */
public class AbcNumber {
    public int convert(String num){
String t = "";
        for (int i = 0; i < num.length(); ++i) {
            char chars = num.charAt(i);
            if (!t.isEmpty()){
                t+= "";
            }
            int n = (int)chars-(int)'a';
            t+=String.valueOf(n);
        }
        return Integer.parseInt(t);
    }
}
