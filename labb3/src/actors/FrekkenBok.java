package actors;

import enums.Place;
import interfaces.HolidayAction;

public class FrekkenBok extends Person implements HolidayAction {

    public FrekkenBok(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public void trip() {
        place(Place.HOME);
    }


}
