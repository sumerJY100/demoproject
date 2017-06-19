package priv.bruce.demoproject.hibernatedemo.dao;

/**
 * Created by jiezhou on 2017/6/15.
 */
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import priv.bruce.demoproject.hibernatedemo.model.Users;


public class UsersDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List<Users> getAllUser(){
        String hsql="from Users";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hsql);

        return query.list();
    }
}