package edu.ti.caih313.collections.dataobj;

import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.*;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class PersonSortableDemo {
    public static void main(String[] args) {
        Person personArray[] = {
                new Person(new Name("Bob", "Smith"), "male", 1),
                new Person(new Name("Jane", "Doe"), "female", 10),
                new Person(new Name("Tony", "Stark"), "male", 10),
                new Person(new Name("Bo", "Peep"), "female", 5),
                new Person(new Name("Goon", "Deep"), "female", 5)
        };

        List<Person> personList = Arrays.asList(personArray);
        PrintGeneric<Person> personSortDemo = new PrintGeneric<>();
        personSortDemo.printCollection(personList);

        Comparator<Person> listComparator = new Comparator<Person>() {
            @Override
            public int compare(Person n1, Person n2) {
                int personOrder;
                if (n1.getAge() - n2.getAge() > 0) {
                    personOrder = -1;
                } else if (n1.getAge() - n2.getAge() < 0) {
                    personOrder = 1;
                } else {
                    personOrder = 0;
                }
                if (personOrder == 0) {
                    personOrder = n1.getGender().compareTo(n2.getGender());
                    if (personOrder == 0){
                        personOrder = n1.getName().getLastName().compareTo(n2.getName().getLastName());
                        if (personOrder == 0){
                            personOrder = n1.getName().getFirstName().compareTo(n2.getName().getFirstName());
                        }
                    }
                }
                return personOrder;
            }
        };
        Collections.sort(personList, listComparator);
        System.out.print("\n");
        System.out.println("Print sorted by age, gender, and name.");
        personSortDemo.printCollection(personList);
    }
}
