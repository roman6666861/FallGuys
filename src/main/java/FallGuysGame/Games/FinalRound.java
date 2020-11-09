package FallGuysGame.Games;

import FallGuysGame.Entities.Person;
import FallGuysGame.Game;

import java.util.List;
import java.util.Random;

public class FinalRound extends Game {

    public FinalRound(List<Person> sixtyRandomGuys) {
        super(sixtyRandomGuys);
    }

    @Override
    public void play() throws InterruptedException {
        System.out.println("Запускаю Финальный Раунд");
        Thread.sleep(5000);
        Person winner = getSixtyRandomGuys().get(new Random().nextInt(getSixtyRandomGuys().size()));
        System.out.println("Победил " + winner.getName() + "!");
    }
}
