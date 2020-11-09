package FallGuysGame.Games;

import FallGuysGame.Entities.Person;
import FallGuysGame.Game;

import java.util.List;

public class Football extends Game {
    public Football(List<Person> sixtyRandomGuys) {
        super(sixtyRandomGuys);
    }

    @Override
    public void play() throws InterruptedException {
        System.out.println("Запускаю Футболл");
        int startSize = getSixtyRandomGuys().size() / 2;
        Thread.sleep(6000);
        for (int i=0; i<15; i++ ) {
            getSixtyRandomGuys().remove(i);
            if (getSixtyRandomGuys().size() == startSize)
                break;
        }
        System.out.println("Осталось " + getSixtyRandomGuys().size() + " челиков");
    }
}
