package edu.ti.caih313.collections.dataobj;

public class PersonSortable extends Person implements Comparable<PersonSortable> {
    public PersonSortable(Name name, int age, Gender gender){
        super(name, age, gender);
    }
    @Override
    public int compareTo(PersonSortable otherPersonSortable) {
        double personOrder = otherPersonSortable.getAge() - getAge();

        if (personOrder == 0) {
            if (getGender() == otherPersonSortable.getGender()){
                personOrder = 0;
            }
            else if(otherPersonSortable.getGender() == Gender.FEMALE){
                personOrder = 1;
            }
            else{
                personOrder = -1;
            }
            if (personOrder == 0){
                personOrder = getName().getLastName().compareTo(otherPersonSortable.getName().getLastName());
                if (personOrder == 0){
                    personOrder = getName().getFirstName().compareTo(otherPersonSortable.getName().getFirstName());
                }
            }
        }
        return (int)personOrder;
    }


}
