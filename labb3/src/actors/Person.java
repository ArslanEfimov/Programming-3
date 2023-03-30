package actors;

import enums.EmotionalCondition;
import enums.Place;
import interfaces.Movement;

import java.util.Objects;

public abstract class Person implements Movement {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }
    public void emotion(EmotionalCondition emotionalCondition) {
        if (emotionalCondition != EmotionalCondition.CALM)
            System.out.println("У героя " + getName() + " появляется эмоция: " + emotionalCondition);
        else
            System.out.println(getName() + " в спокойном состоянии");
    }
    public void place(Place place) {

            System.out.println(getName() + " проведет каникулы в месте: " + place);

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
