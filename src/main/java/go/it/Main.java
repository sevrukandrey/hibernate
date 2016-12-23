package go.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asevruk on 12/19/2016.
 */
public class Main {

    private EmployeeControler employeeControler;

    public static void main(String[] args) {
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-contest1.xml","hibernate-contest.xml");
        Main main = applicationContext.getBean(Main.class);
        main.toStart();
    }

    private void toStart() {

            employeeControler.createEmployee();

    }

    public void setEmployeeControler(EmployeeControler employeeControler) {
        this.employeeControler = employeeControler;
    }
}
