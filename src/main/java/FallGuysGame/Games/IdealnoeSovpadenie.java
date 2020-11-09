package FallGuysGame.Games;

import FallGuysGame.Entities.Person;
import FallGuysGame.Game;

import java.util.List;

public class IdealnoeSovpadenie extends Game {
    public IdealnoeSovpadenie(List<Person> sixtyRandomGuys) {
        super(sixtyRandomGuys);
    }
    @Override
    public void play()throws InterruptedException {
        System.out.println("Запускаю Идеальное совпадение");
        Thread.sleep(3000);
        for (int i=0; i<15; i++ ) {
            getSixtyRandomGuys().remove(i);
        }
        System.out.println("Осталось " + getSixtyRandomGuys().size() + " челиков");
    }
}
