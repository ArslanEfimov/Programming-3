package actors;

import enums.Place;
import interfaces.HolidayAction;

public class Uncle extends Person implements HolidayAction {

    public Uncle(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println("По мнению " + person.getName() + ", у " + getName() + " скверный характер");
    }

    @Override
    public void trip() {
        place(Place.HOME);
    }
}
