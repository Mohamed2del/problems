package com.company.solved;

import java.util.*;

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
        int numberofcriteria = getnumberofcriteria(query);
        List<String> criterialist = criteria(query);
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        for (int i = 0; i < numberofcriteria; i++) {
            map.put(i+1,criterialist.get(i));
        }




        System.out.println(String.format("Table Name: %s \n Number of columns in select: %d \n Number of criteria: %d \n Criteria: " , tablename,columnsnum ,numberofcriteria ));
        for(Map.Entry m : map.entrySet()){
            System.out.println("  "+m.getKey()+" "+m.getValue());
        }
    }


    private int getnumberofcriteria(String query) {

        return criteria(query).size();
    }


    public List<String> criteria (String query){
        String s = query.substring(indexOfWhere(query)+6);
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("and")) {
                list.remove(i);
            }
            else if(list.get(i).contains("or")){
                list.remove(i);
            }

        }
        int numberofcritiera = list.size();
        return list;
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
        return indexofwhere;
    }

}
