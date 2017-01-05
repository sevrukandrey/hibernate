package go.it;

import go.it.controler.DishController;
import go.it.controler.EmployeeControler;
import go.it.model.Dish;
import go.it.model.DishCategory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asevruk on 12/19/2016.
 */
public class Main {


    private EmployeeControler employeeControler;
    private DishController dishController;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-contest1.xml", "hibernate-contest.xml");
        Main main = applicationContext.getBean(Main.class);
        main.toStart();
    }

    private void toStart() {


       // employeeControler.createEmployee();
        dishController.createDish();

        dishController.getAllDish().forEach(System.out::println);
        employeeControler.getAllEmployees().forEach(System.out::println);
    }

    public void setEmployeeControler(EmployeeControler employeeControler) {
        this.employeeControler = employeeControler;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }
}
