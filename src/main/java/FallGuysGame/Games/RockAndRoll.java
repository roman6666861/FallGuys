package FallGuysGame.Games;

import FallGuysGame.Entities.Person;
import FallGuysGame.Game;

import java.util.List;

public class RockAndRoll extends Game {
    public RockAndRoll(List<Person> sixtyRandomGuys) {
        super(sixtyRandomGuys);
    }

    @Override
    public void play() throws InterruptedException {
        System.out.println("Запускаю Рокэндролл");
        int startSize = getSixtyRandomGuys().size() / 3;
        Thread.sleep(1000);
        for (int i=0; i<getSixtyRandomGuys().size(); i++ ) {
            getSixtyRandomGuys().remove(i);
            if (getSixtyRandomGuys().size() == startSize)
                break;
        }
        System.out.println("Осталось " + getSixtyRandomGuys().size() + " челиков");
    }
}
