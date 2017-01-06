package go.it.dao.hibernate;

import go.it.dao.DishDAO;
import go.it.model.Dish;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
public class HDishDAO implements DishDAO {

    private SessionFactory sessionFactory;

    @Transactional
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    @Override
    public List<Dish> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select d from Dish d").list();
    }

    @Override
    public Dish findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query =session.createQuery("select d from Dish d where d.name like:name");
        query.setParameter("name",name);
        return (Dish) query.uniqueResult();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
