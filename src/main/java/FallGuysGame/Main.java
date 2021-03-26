package FallGuysGame;

import FallGuysGame.Entities.Person;
import FallGuysGame.scripts.GuysFactory;
import FallGuysGame.scripts.SuitsCreaterScript;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new FallGuys(new FallGuysService().getSixtyRandomGuys()).start();
        System.out.println("Я написал транслейтер");
    }
}
