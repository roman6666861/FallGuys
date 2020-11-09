package FallGuysGame.scripts;

import FallGuysGame.Entities.Suits;
import FallGuysGame.FallGuysService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuitsCreaterScript {

    public final static List<String> suits = new ArrayList<>(Arrays.asList("Динозавр", "Соник", "Дичь в шапке", "Фея", "Робот", "Орк", "Огр","Серый бочок",
            "Аквариум", "Блестящая единорожка","Виртуозная подача","Дикий голубь", "Детёныш", "Злая ведьма","Оливер", "Шут"));

    public static void createSuits(){
        List<Suits> resultList = new ArrayList<>();
        for (String s : suits) {
            Suits suits = new Suits(s);
            resultList.add(suits);
        }
        new FallGuysService().saveUsers(resultList);
    }
}
