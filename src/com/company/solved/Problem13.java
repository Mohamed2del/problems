package com.company.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem13 {

    public boolean check(String email){
        int at = email.indexOf("@");
        int dot = email.lastIndexOf(".");
        char[] s = email.toCharArray();
        ArrayList<String> emailarray = new ArrayList<String>(Arrays.asList(email.split("")));

        if (Collections.frequency(emailarray,"@") > 1){
            return  false;
        }
        String x = String.valueOf(s[at+1]);

        return  email.length() > 0 &&
                at > 0 &&
                dot > at + 1 &&
                dot < email.length() &&
                !x.equals(".")  &&
                email.indexOf( " " ) == -1 &&
                email.indexOf( ".." ) == -1;
    }
}
