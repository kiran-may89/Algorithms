package com.company;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args){

        String compression = "aabrrrccfffggg";
        int n = compression.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<n;i++){
            int count = 1;
            while (i<n-1 && compression.charAt(i) == compression.charAt(i+1) ){
                count ++;
                i++;

            }
            stringBuilder.append(count+""+compression.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }

}
