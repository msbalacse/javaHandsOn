package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Person,Diamond> map =new HashMap<>();
        map.put(new Person("joshua"),new Diamond("african diamond"));

        System.out.println(new Person("joshua").hashCode());
        System.out.println(new Person("joshua").hashCode());
        System.out.println(map.get(new Person("joshua")));
    }
    private static void maps() {
        Map<Integer,Person> map = new HashMap<>();

        map.put(1,new Person("joshua"));
        map.put(2,new Person("alexa"));
        map.put(3,new Person("max"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.remove(3);
        map.entrySet().forEach(System.out::println);

        map.forEach((integer, person) -> {
            System.out.println(integer+" "+person);
        });
        System.out.println(map.getOrDefault(3,new Person("DefaultValueSet")));

        map.entrySet().forEach(System.out::println);
    }

    static class Person{
     String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
