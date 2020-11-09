package FallGuysGame;

import FallGuysGame.Entities.Person;
import lombok.Getter;

import java.util.List;

public abstract class Game {
    @Getter
    private List<Person> sixtyRandomGuys;

    public Game(List<Person> sixtyRandomGuys) {
        this.sixtyRandomGuys = sixtyRandomGuys;
    }

    public abstract void play() throws InterruptedException;
}
