package actors;

import enums.Place;
import interfaces.HolidayAction;

public class Dad extends Person implements HolidayAction {

    public Dad(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public void trip() {
        place(Place.WHITE_BOAT);
    }
}
