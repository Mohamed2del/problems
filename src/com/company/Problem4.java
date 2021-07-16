package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem4
Given two inputs (type and value), type is about those values {Text, Date, DateTime, Email,
Decimal, and Integer}, and you need to validate the value input against its type, so for
example:
1- If type is Text, so value can be any alphanumeric value
2- If type is Date, so value must be in this format “yyyy-MM-dd” like “2021-07-12”
3- If type is DateTime, so value must be in this format “yyyy-MM-dd hh24:mm:ss” like
“2021-07-12 15:20:00”
4- If type is Email, so value must be in this format for ex: mosama@citglobal.com
5- If type is Decimal, so value can be for ex: 1000 or 550.655
6- If type is Integer, so value must be on this format only 1000 or 2100
 */
public class Problem4 {

    private static final String regexmail = "^(.+)@(.+)$";
    private static final String regexdate = "^(19|20)\\d\\d[-](0[1-9]|1[012])[-](0[1-9]|[12][0-9]|3[01])$";
    private static final String regexdateTime = "^(19|20)\\d\\d[-](0[1-9]|1[012])[-](0[1-9]|[12][0-9]|3[01])[ ]([01][0-9]|2[0123])[:]([0-5][0-9])[:]([0-5][0-9])$";
    private static final String regexdecimal = "^[0-9]{3}\\.[0-9]{3}$";
    private static final String regexinteger = "^[0-9]{4}$";

    public String problem ( String type , String value ) {
        if (type == "Text"){
            System.out.println(value);
        return value;
    }
        else if (type=="DateTime"){
            Matcher matcher = match(regexdateTime,value);
            System.out.println((matcher.matches() ? "valid" : "invalid please enter Date with this format (yyyy-MM-dd hh24:mm:ss)"));

        }
        else if (type=="Date"){
            Matcher matcher = match(regexdate,value);
            System.out.println((matcher.matches() ? "valid" : "invalid please enter Date with this format (yyyy-MM-dd hh24:mm:ss)"));

        }
        else if (type=="Email"){
            Matcher matcher = match(regexmail,value);
            System.out.println((matcher.matches() ? "valid" : "invalid enter mail with this format -> x@x.com"));
        }

        else if (type=="Decimal"){
            Matcher matcher = match(regexdecimal,value);
            System.out.println((matcher.matches() ? "valid" : "invalid enter mail with this format -> xxx.xxx"));
        }
        else if (type=="Integer"){
            Matcher matcher = match(regexinteger,value);
            System.out.println((matcher.matches() ? "valid" : "invalid enter mail with this format -> xxxx"));
        }

        return value;
    }

    public Matcher match (String regex,String value){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher;
    }
}
