package FallGuysGame;
import java.util.*;
import FallGuysGame.Entities.Person;

public interface FallGuyDAO {
    Person findById(int id);
    List<Person> findAll();
    void save(Person chelik);
    void delete(Person chelik);
    void saveList(List<?> list);
    void deleteAllRows(String entity);
    List<Person> getSixtyRandomGuys();
}
