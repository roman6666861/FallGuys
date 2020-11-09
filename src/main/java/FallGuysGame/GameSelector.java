package FallGuysGame;

import FallGuysGame.Entities.Person;
import FallGuysGame.Games.*;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Random;

public class GameSelector {
    private List<Person> sixtyGuys;
    @SneakyThrows
    public GameSelector(List<Person> sixtyGuys) {
        this.sixtyGuys = sixtyGuys;
        selectFirstGame();
        selectSecondGame();
        selectFinalRound();
    }

    private void selectFirstGame() throws InterruptedException {
        if (sixtyGuys.size() == 60) {
            Random random = new Random();
            if (random.nextInt(10) > 4) {
                new SklizskieBoi(sixtyGuys).play();
            }
            else {
                new IdealnoeSovpadenie(sixtyGuys).play();
            }
        }
    }

    private void selectSecondGame() throws InterruptedException {
        if (sixtyGuys.size() % 2 == 0){
            new Football(sixtyGuys).play();
        }
        else if (sixtyGuys.size() % 3 == 0) {
            new RockAndRoll(sixtyGuys).play();
        }
    }

    private void selectFinalRound() throws InterruptedException {
        new FinalRound(sixtyGuys).play();
    }
}
