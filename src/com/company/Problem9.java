package com.company;

import java.util.Arrays;

/*
Problem9
Given an input string as sql query for ex:
select FIRST_NAME,MIDDLE_NAME,PHONE,AGE,ADDRESS from USER where STATUS=0
and/or AGE>21
Write a program to input string as select query, and output will be as below:
Table Name: USERS
Number of columns in select: 5
Number of criteria: 2
Criteria:
1- STATUS=0
2- AGE>21

 */
public class Problem9 {

    public void sql(String query){

        String tablename = getNameOftable(query);
        int columnsnum = getNumberofColumns(query);

        System.out.println(query.substring(indexOfWhere(query) + 6).split(" "));





        System.out.println(String.format("Table Name: %s \n Number of columns in select: %d \n Number of criteria: " , tablename,columnsnum ));
    }


    public int getnumberofcriteria (String query){

    return 0;
    }
    public int getNumberofColumns (String query ){
        String[] tables = query.split(",");
        // Number of columns
        int numberofcolumns = tables.length;
        return numberofcolumns;
    }

    public String getNameOftable (String query ){
        // Name of Table

        int indexoffrom = indexOfFrom(query);
        int indexofwhere = indexOfWhere(query);
        String tablename = query.substring(indexoffrom + 4,indexofwhere);
        return tablename;
    }

    public int indexOfFrom (String query){
        int indexoffrom = query.indexOf("from");
        return indexoffrom;
    }

    public int indexOfWhere( String query){
        int indexofwhere = query.indexOf("where");
        System.out.println(indexofwhere);
        return indexofwhere;
    }

}
