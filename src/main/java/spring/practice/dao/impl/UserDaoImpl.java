package spring.practice.dao.impl;

import org.hibernate.Session;
import spring.practice.dao.UserDao;
import spring.practice.model.User;
import javax.transaction.Transaction;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(cinemaHall);
            transaction.commit();
            return cinemaHall;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert Cinema Hall entity " + cinemaHall, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
