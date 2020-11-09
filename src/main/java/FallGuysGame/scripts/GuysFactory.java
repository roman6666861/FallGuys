package FallGuysGame.scripts;

import FallGuysGame.Entities.Person;

import java.util.*;

public class GuysFactory {
    public static List<Person> createGuys(){
        List<Person> cheliki = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 60; i++) {
            Person person = new Person();
            person.setName("FallGuy " + random.nextInt(10000));
            person.setSuit(SuitsCreaterScript.suits.get(random.nextInt(SuitsCreaterScript.suits.size())));
            person.setLevel(random.nextInt(40));
            cheliki.add(person);
        }
        return cheliki;
    }
}
