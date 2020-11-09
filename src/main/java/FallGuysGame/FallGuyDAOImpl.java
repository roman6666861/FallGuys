package FallGuysGame;

import FallGuysGame.Entities.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class FallGuyDAOImpl implements FallGuyDAO {
    @Override
    public Person findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);
    }

    @Override
    public List<Person> findAll() {
        List<Person> users = (List<Person>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Person").list();
        return users;
    }

    @Override
    public void save(Person chelik) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(chelik);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Person chelik) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(chelik);
        tx1.commit();
        session.close();
    }

    @Override
    public void saveList(List<?> list) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        for (Object person : list) {
            session.save(person);
        }
        tx1.commit();
        session.close();
    }

    @Override
    public void deleteAllRows(String entity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.createQuery("delete from " + entity).executeUpdate();
        tx1.commit();
        session.close();
    }

    @Override
    public List<Person> getSixtyRandomGuys() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        List<Person> list = (List<Person>)session.createQuery("FROM Person p ORDER BY RANDOM()").setMaxResults(60).list();
        tx1.commit();
        session.close();
        return list;
    }
}
