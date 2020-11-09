package FallGuysGame;

import FallGuysGame.Entities.Person;

import java.util.List;

public class FallGuys {
    private List<Person> sixtyRandomGuys;

    public FallGuys(List<Person> sixtyRandomGuys) {
        this.sixtyRandomGuys = sixtyRandomGuys;
    }

    public void start() throws InterruptedException {
        System.out.println("Игра начинается!");
        new GameSelector(sixtyRandomGuys);
        System.out.println("Игра закончилась!");
    }
}
