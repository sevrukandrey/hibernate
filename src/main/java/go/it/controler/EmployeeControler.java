package go.it.controler;

import go.it.dao.EmployeeDAO;
import go.it.model.Employee;
import go.it.model.Position;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
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
        employee.setId(2l);
        employee.setName("sara");
        employee.setSurname("ss");
        employee.setPosition(Position.WAITER);
        employee.setPhoneNumber("1111-11-11");
        employee.setSalary(2323.00f);
        if (!allEmployee.contains(employee)){
            employeeDAO.save(employee);

        }
    }

    @Transactional
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAll();
    }

    @Transactional
    public Employee getEmployeeByName(String name){
        return employeeDAO.findByName(name);
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
