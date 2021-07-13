package com.company.solved;



/*
Problem2
Given a string, return a version without the first and last char, so "Hello" yields "ell". The
string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
public class Problem2 {
    public String withoutEnd (String s ){

        String string = s.substring(1,s.length()-1);

        return string;
    }
}
