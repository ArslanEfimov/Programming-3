package actors;

import enums.Place;
import interfaces.HolidayAction;

public class Mum extends Person implements HolidayAction {

    public Mum(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println(getName() + " вызывает " + person.getName() );
    }

    @Override
    public void trip() {
        place(Place.WHITE_BOAT);
    }
}
