package FallGuysGame.Games;

import FallGuysGame.Entities.Person;
import FallGuysGame.Game;

import java.util.List;

public class SklizskieBoi extends Game {

    public SklizskieBoi(List<Person> sixtyRandomGuys) {
        super(sixtyRandomGuys);
    }

    @Override
    public void play() throws InterruptedException {
            System.out.println("Запускаю Склизкие бои");
            Thread.sleep(5000);
            for (int i=0; i<20; i++ ) {
                getSixtyRandomGuys().remove(i);
            }
            System.out.println("Осталось " + getSixtyRandomGuys().size() + " челиков");
        }
}
