package go.it;

import go.it.controler.DishController;
import go.it.controler.EmployeeControler;
import go.it.controler.OrderController;
import go.it.model.Dish;
import go.it.model.DishCategory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asevruk on 12/19/2016.
 */
public class Main {


    private EmployeeControler employeeControler;
    private DishController dishController;
    private OrderController orderController;


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-contest1.xml", "hibernate-contest.xml");
        Main main = applicationContext.getBean(Main.class);
        main.toStart();
    }

    private void toStart() {

        List<String> dishes = new ArrayList<>();
        dishes.add("salat");


        //employeeControler.createEmployee();

        //    System.out.println(  employeeControler.getAllEmployees());

        //  System.out.println( employeeControler.getEmployeeByName("sara"));

        // employeeControler.createEmployee();
        //   dishController.createDish();

        orderController.createOrder("sara", dishes);

        // System.out.println(employeeControler.getAllEmployees());
        //   System.out.println(dishController.getAllDish());

        //orderController.createOrder("12",dishes);
        // orderController.getAllOrders();


        //

        //System.out.println(employeeControler.getEmployeeByName("12"));

        //dishController.createDish();
        // System.out.println(dishController.getDishByName("salat"));
        // dishController.getAllDish().forEach(System.out::println);
        // employeeControler.getAllEmployees().forEach(System.out::println);
    }

    public void setEmployeeControler(EmployeeControler employeeControler) {
        this.employeeControler = employeeControler;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }
}
