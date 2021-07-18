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
    public void addObjects(ArrayList<Person> list) {
        list.add(new Person("Ahmed", 22));
        list.add(new Person("Mohamed", 50));
        list.add(new Person("Alaa", 30));
        list.add(new Person("Sofaa", 25));
        list.add(new Person("Mono", 14));
    }

    public void ascendingSort(ArrayList<Person> list) {

        list.sort(comparator(list));
    }

    public Comparator comparator(ArrayList<Person> list) {
        Comparator<Person> comparator = (object1, object2) -> object1.getName().compareTo(object2.getName());
        return comparator;
    }

    public void descendingOrder(ArrayList<Person> persons) {


        Comparator<Person> comparator = (object1, object2) -> object1.getName().compareTo(object2.getName());

        persons.sort(Collections.reverseOrder(comparator));

    }

    public Map<String, Person> arrayListtohash(ArrayList<Person>arrayList){
        Map<String,Person> map = new HashMap<>();
        for (Person p: arrayList) {
            map.put(p.getName(),p);
        }
        return map;

    }

    public HashMap sortnew(Map<String, Person> map) {
        ArrayList<Person> list = new ArrayList<>();
        addObjects(list);
        arrayListtohash(list);

        HashMap<String, Person> temp
                = map.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getKey().compareTo(
                        i2.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        // Display the HashMap which is naturally sorted
        for (Map.Entry<String, Person> entry :
                temp.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue().getName());
        }
        return temp;
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

