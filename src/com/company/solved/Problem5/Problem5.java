package com.company.solved.Problem5;

import java.util.*;
import java.util.stream.Collectors;

/*
Problem5
Given class Person
Person
{
String name;
int age;
 public Person(String name, int age)
{
 this.name=name;
 this.age=age;
 }
}
Write a program to sort list of persons in both ascending and descending orders
 */
public class Problem5 {



    // Adding custom objects
    public  void addObjects(ArrayList<Person> list)
    {
        list.add(new Person("Ahmed",22));
        list.add(new Person("Mohamed",50));
        list.add(new Person("Alaa",30));
        list.add(new Person("Sofaa",25));
        list.add(new Person("Mono",14));
    }

    public  void ascendingSort(ArrayList<Person> list)
    {

        list.sort(comparator(list));
    }

    public Comparator comparator (ArrayList<Person> list){
        Comparator<Person> comparator = (object1, object2) -> object1.getName().compareTo(object2.getName());
        return comparator;
    }

    public void descendingOrder(ArrayList<Person> persons){


        Comparator<Person> comparator = (object1, object2) -> object1.getName().compareTo(object2.getName());

        persons.sort(Collections.reverseOrder(comparator));

    }

    public HashSet<Person> sortnew (){
        ArrayList<Person> arrayList = new ArrayList<>();
        addObjects(arrayList);
        HashSet<Person> personsTree = new HashSet<>();
//        pers.addAll(personsTree);
        personsTree.addAll(arrayList);

        for (Person x:personsTree) {
            System.out.println(x.getName());
        }
        System.out.println("+++============++++==+++=+++");

        TreeSet<Person> treeSet = new TreeSet<Person>();



        return personsTree;
    }

    public  void addObjectstoTree(TreeSet<Person> list)
    {
        list.add(new Person("Ahmed",22));
        list.add(new Person("Mohamed",50));
        list.add(new Person("Alaa",30));
        list.add(new Person("Sofaa",25));
        list.add(new Person("Mono",14));
    }

    public void printlist (ArrayList<Person> persons){
        for( Person strDay : persons ){
            System.out.println("Name:"+ strDay.getName() + " Age:"+strDay.getAge());
        }
    }

}

