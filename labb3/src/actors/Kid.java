package actors;

public class Kid extends Person{

    public Kid(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println(getName() + " разговаривает с " + person.getName());
    }
}
