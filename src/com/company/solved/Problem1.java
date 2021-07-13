package com.company.solved;

public class Problem1 {


    /*
    Problem1
    Given a string and an int n, return a string made of the first and last n chars from the
    string. The string length will be at least n.

    Helped me : https://www.w3schools.com/java/java_ref_string.asp
     */

    public String nTwice (String s , int n){

        String string = s.substring(0,n).concat(s.substring(s.length()-n));

        return string;
    }
}
