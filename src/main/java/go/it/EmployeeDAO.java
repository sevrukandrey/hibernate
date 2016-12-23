package go.it;

import java.util.List;

/**
 * Created by asevruk on 12/19/2016.
 */
public interface EmployeeDAO {

    void save(Employee employee);
    Employee getEmployee(long id);
    List<Employee> getAll();
    void remove(Employee employee);


}
