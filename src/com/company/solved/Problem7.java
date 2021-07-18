package com.company.solved;


import java.util.*;

/*
Problem7
Given an input string, write a program to print count occurrence of each character in the
string, for ex: if the input string is “Hello World”, the output will be as below:
H = 1, e = 1, l = 3, o = 2, W = 1, r = 1, d = 1
 */
public class Problem7 {

//    public char[] convertToArray (String str){
//        char[] charlist = str.toCharArray();
//
//        return charlist;
//    }
//
//    public long count (String str , char c){
//        long count = str.chars().filter(ch -> ch ==c).count();
//        return count;
//    }

    public ArrayList<String> toLinkedList (String s   ) {
            ArrayList<String> list = new ArrayList<>();

            for (char ch: s.toCharArray()) {
                list.add(String.valueOf(ch));
            }

//        Set<String> set = new LinkedHashSet<>();
//
//        // Add the elements to set
//        set.addAll(list);
//
//        // Clear the list
//        list.clear();
//
//        // add the elements of set
//        // with no duplicates to the list
//        list.addAll(set);
//
//        System.out.println(list);

        // return the list
        return list;
    }



    public void newsolution(String s){
            Map<Character, Integer> map = new HashMap<>();
            s.chars().forEach(e->map.put((char)e, map.getOrDefault((char)e, 0) + 1));
            System.out.println(map);
    }

    // freq
    public  void countFrequencies(ArrayList<String> list)
    {

        // hash set is created and elements of
        // arraylist are insertd into it
        Set<String> st = new LinkedHashSet<>(list);
        for (String s : st)
            System.out.println(s + " = " + Collections.frequency(list, s));
    }
}
