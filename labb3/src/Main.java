import actors.*;
import enums.EmotionalCondition;

public class Main {

    public static void main(String[] args) {
        Kid kid = new Kid("Малыш");
        Carlson carlson = new Carlson("Карлсон");
        FrekkenBok frekkenBok = new FrekkenBok("Фрекен Бок");
        Mum mum = new Mum("мама");
        Dad dad = new Dad("папа");
        Uncle uncle = new Uncle("Дядя Юлиус");
        Brothers brothers = new Brothers("Боссе и Бетан");
        kid.emotion(EmotionalCondition.ALLEMOTIONS);
        carlson.emotion(EmotionalCondition.ANGRY);
        mum.action(frekkenBok);
        carlson.action(mum);
        carlson.emotion(EmotionalCondition.PERK);
        kid.action(carlson);
        uncle.action(kid);
        uncle.trip();
        mum.trip();
        dad.trip();
        brothers.trip();


    }
}
