package com.msbala.array;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
      LinkedList<Person> linkedList = new LinkedList<>();
      linkedList.add(new Person("alex",21));
      linkedList.add(new Person("bonk",19));
      linkedList.add(new Person("teo",34));
        ListIterator<Person> personListIterator  = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    private static void queues(){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",21));
        supermarket.add(new Person("Maria,",34));
        supermarket.add(new Person("Joona",16));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }
    static record Person(String name, int age){}
}
