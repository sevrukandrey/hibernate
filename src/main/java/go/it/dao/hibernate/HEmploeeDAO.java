package go.it.dao.hibernate;

import go.it.dao.EmployeeDAO;
import go.it.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asevruk on 12/19/2016.
 */
public class HEmploeeDAO implements EmployeeDAO {

    private SessionFactory sessionFactory;





    @Transactional
    public void save(Employee employee) {
       sessionFactory.getCurrentSession().save(employee);
    }

    public Employee getEmployee(long id) {
        return null;
    }

    public List<Employee> getAll() {

        return  sessionFactory.getCurrentSession().createQuery("select e from Employee e ").list();

    }

    public void remove(Employee employee) {

        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public Employee findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select e from Employee e WHERE e.name like :name");
        query.setParameter("name", name);
        return (Employee) query.uniqueResult();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
