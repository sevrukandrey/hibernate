package go.it.dao.hibernate;

import go.it.dao.OrderDAO;
import go.it.model.Order;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
public class HOrderDAO implements OrderDAO {
    private SessionFactory sessionFactory;

    @Override
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public List<Order> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select o from Order o").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
