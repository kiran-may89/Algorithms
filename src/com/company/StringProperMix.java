package com.company;

public class StringProperMix {
    public static void main(String[] args) {
        String firstWord = "Test";
        String secondWord = "Task";
        String mix = "TesTaskt";

        boolean isFirstMixValid = partCheck(firstWord, secondWord ,mix);
        System.out.println(isFirstMixValid);
    }

    public static boolean partCheck(String x, String y,String mix) {
        if (x.length() == 0 && y.length() ==0&& mix.length() == 0) {
            return true;
        }
        if (mix.length() == 0) {
            return false;

        }
        boolean xValid =  (x.length() != 0 && mix.charAt(0) == x.charAt(0)) && partCheck(x.substring(1), y,mix.substring(1));

        boolean yValid = (y.length() != 0 && mix.charAt(0) == y.charAt(0)) &&  partCheck(x, y.substring(1),mix.substring(1));
        return xValid || yValid;
    }

}
