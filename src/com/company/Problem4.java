package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;

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

    <Value> Value problem ( String type , Value value )  {
        if(type=="Text")
            return value;
        else if (type=="Date"){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
        }


        return value;
    }
}
