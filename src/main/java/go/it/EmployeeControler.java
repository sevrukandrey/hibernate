package go.it;

import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by asevruk on 12/19/2016.
 */


public class EmployeeControler {
    private EmployeeDAO employeeDAO;


    @Transactional
    public void createEmployee(){

        Set<Employee> allEmployee = new HashSet<Employee>(employeeDAO.getAll());

        Employee employee = new Employee();
        employee.setId(1l);
        employee.setName("asd");
        employee.setSurname("asdasd");
        employee.setPosition(Position.COOK);
        employee.setPhoneNumber("1111-11-11");
        employee.setSalary(2323.00f);
        if (!allEmployee.contains(employee)){
            employeeDAO.save(employee);

        }


    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
