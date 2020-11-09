package FallGuysGame;
import java.util.*;
import FallGuysGame.Entities.Person;

public class FallGuysService {
    FallGuyDAO fallGuyDAO = new FallGuyDAOImpl();

    public Person findById(int id) {
        return fallGuyDAO.findById(id);
    }

    public void saveUser(Person chelik) {
        fallGuyDAO.save(chelik);
    }

    public void deleteUser(Person chelik) {
        fallGuyDAO.delete(chelik);
    }

    public List<Person> findAllUsers() {
        return fallGuyDAO.findAll();
    }
    public void saveUsers(List<?> list){
        fallGuyDAO.saveList(list);
    }
    public void deleteAllRows(String entity){
        fallGuyDAO.deleteAllRows(entity);
    }
    public List<Person> getSixtyRandomGuys(){
        return fallGuyDAO.getSixtyRandomGuys();
    }
}
