package actors;

import enums.Place;
import interfaces.HolidayAction;

public class Brothers extends Person implements HolidayAction {

    public Brothers(String name) {
        super(name);
    }

    @Override
    public void action(Person persson) {
    }

    @Override
    public void trip() {
        place(Place.UNKNOWN_PLACE);
    }
}
