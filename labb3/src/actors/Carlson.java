package actors;

public class Carlson extends Person{

    public Carlson(String name) {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println(getName() + " - это лучший присмотрщик за детьми и он под рукой у " + person.getName() );
    }
}
