package com.company.solved;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem6 {

    /*
    Problem6
Given two lists, please write a program to combine distinct values (not repeated values)
between two lists without for loop, for ex:
If we have list1 List<Integer> contains (1,5,7) and we have another list2 List<Integer>
contains (9,5,7), so the output of the list which combine those two lists will be (1,5,7,9)
     */
    public ArrayList<Integer> combin (ArrayList<Integer> first , ArrayList<Integer> second ){

        first.addAll(second);
        System.out.println(first);
        return first;
    }

   public ArrayList<Integer> removedubplicate (ArrayList<Integer> first  ){
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(first);
        first.clear();
        first.addAll(set);
        System.out.println(first);
        return first;
    }
}
