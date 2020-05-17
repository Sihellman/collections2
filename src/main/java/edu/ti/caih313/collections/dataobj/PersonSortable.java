package edu.ti.caih313.collections.dataobj;

public class PersonSortable extends Person implements Comparable<PersonSortable> {
    public PersonSortable(int age, Name name, String gender){
        super(name, gender, age);
    }
    @Override
    public int compareTo(PersonSortable otherPersonSortable) {//subtract them
        int personOrder;
        if (getAge() - otherPersonSortable.getAge() > 0) {
            personOrder = -1;
        } else if (getAge() - otherPersonSortable.getAge() < 0) {
            personOrder = 1;
        } else {
            personOrder = 0;
        }
        if (personOrder == 0) {
            personOrder = getGender().compareTo(otherPersonSortable.getGender());
            if (personOrder == 0){
                personOrder = getName().getLastName().compareTo(otherPersonSortable.getName().getLastName());
                if (personOrder == 0){
                    personOrder = getName().getFirstName().compareTo(otherPersonSortable.getName().getFirstName());
                }
            }
        }
        return personOrder;
    }
}
