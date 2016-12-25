package go.it.dao.hibernate;

import go.it.dao.DishDAO;
import go.it.model.Dish;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
public class HDishDAO implements DishDAO {
    private SessionFactory sessionFactory;
    @Override
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    @Override
    public List<Dish> getAll() {
        return  sessionFactory.getCurrentSession().createQuery("select d from Dish d").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
