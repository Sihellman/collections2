package edu.ti.caih313.collections.dataobj;

import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class SortWithoutComparator {
    public static void main(String[] args) {
        PersonSortable personArray[] = {
                new PersonSortable(new Name("Bob", "Smith"), 1, MALE),
                new PersonSortable(new Name("Jane", "Doe"),  10, FEMALE),
                new PersonSortable(new Name("Tony", "Stark"), 10, MALE),
                new PersonSortable(new Name("Bo", "Peep"), 5, FEMALE),
                new PersonSortable(new Name("Goon", "Deesh"), 5, MALE),
                new PersonSortable(new Name("Goon", "Deep"), 5, FEMALE)
        };
        List<PersonSortable> nameList = Arrays.asList(personArray);

        PrintGeneric<PersonSortable> personSortDemo = new PrintGeneric<>();
        personSortDemo.printCollection(nameList);
        Collections.sort(nameList);
        System.out.print("\n");
        System.out.println("Print sorted nameList.");
        personSortDemo.printCollection(nameList);

    }
}
