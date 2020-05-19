package edu.ti.caih313.collections.dataobj;

import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.*;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class PersonSortableDemo {
    public static void main(String[] args) {
        Person personArray[] = {
                new Person(new Name("Bob", "Smith"), 1, MALE),
                new Person(new Name("Jane", "Doe"),  10, FEMALE),
                new Person(new Name("Tony", "Stark"), 10, MALE),
                new Person(new Name("Bo", "Peep"), 5, FEMALE),
                new Person(new Name("Goon", "Deep"), 5, FEMALE)

        };

        List<Person> personList = Arrays.asList(personArray);
        PrintGeneric<Person> personSortDemo = new PrintGeneric<>();
        personSortDemo.printCollection(personList);

        Comparator<Person> listComparator = new Comparator<Person>() {
            @Override
            public int compare(Person n1, Person n2) {
                double personOrder = n2.getAge() - n1.getAge();

                if (personOrder == 0) {
                    if (n1.getGender() == n2.getGender()){
                        personOrder = 0;
                    }
                    else if(n2.getGender() == Person.Gender.FEMALE){
                        personOrder = 1;
                    }
                    else{
                        personOrder = -1;
                    }
                    if (personOrder == 0){
                        personOrder = n1.getName().getLastName().compareTo(n2.getName().getLastName());
                        if (personOrder == 0){
                            personOrder = n1.getName().getFirstName().compareTo(n2.getName().getFirstName());
                        }
                    }
                }
                return (int)personOrder;
            }
        };
        Collections.sort(personList, listComparator);
        System.out.print("\n");
        System.out.println("Print sorted by age, gender, and name.");
        personSortDemo.printCollection(personList);
    }
}
