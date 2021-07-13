package com.company.solved;



/*
Problem3
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */

public class Problem3 {

    boolean hasBad(String s) {
        if (s.length() < 3) {
            return false;
        } else if (s.length() > 3) {
            if (s.substring(1, 4).equals("bad")) {
                System.out.println(s.substring(1, 4));
                return true;
            }
        } else if (s.substring(0, 3).equals("bad")) {
            System.out.println(s.substring(0,3));
            return true;
        } else {
            return false;
        }
    return false;
    }
}

