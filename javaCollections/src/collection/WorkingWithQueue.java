package collection;

import java.time.Period;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("joshua",21));
        linkedList.add(new Person("max",22));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

      public static void queues() {
              Queue<Person> supermarket = new LinkedList<>();

              supermarket.add(new Person("joshua",21));
              supermarket.add(new Person("mariya",18));
              supermarket.add(new Person("max",32));

              System.out.println(supermarket.size());
              System.out.println(supermarket.peek());
              System.out.println(supermarket.poll());
              System.out.println(supermarket.size());
              System.out.println(supermarket.peek());


          }

    static record Person(String name, int age){}
}
