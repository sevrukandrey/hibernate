package go.it;

import org.hibernate.SessionFactory;
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

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
