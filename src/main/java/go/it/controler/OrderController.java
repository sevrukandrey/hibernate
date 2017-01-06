package go.it.controler;

import go.it.dao.DishDAO;
import go.it.dao.EmployeeDAO;
import go.it.dao.OrderDAO;
import go.it.model.Dish;
import go.it.model.Employee;
import go.it.model.Orders;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asevruk on 1/6/2017.
 */
public class OrderController {

    private EmployeeDAO employeeDAO;
    private DishDAO dishDao;
    private OrderDAO orderDao;


    @Transactional
    public void createOrder(String waiterName, List<String> dishes) {
        Orders order = new Orders();

        order.setId(1);
        order.setWaiter(employeeDAO.findByName(waiterName));
        order.setDishes(createDishes(dishes));
        order.setTablenumber(1);
        order.setOrderDate(new Date(123));

        orderDao.save(order);


    }


    @Transactional

    public List<Dish> createDishes(List<String> dishes) {
        List<Dish> result = new ArrayList<>();
        for (String dishName : dishes) {
            result.add(dishDao.findByName(dishName));
        }
        return result;

    }

    public List<Orders> getAllOrders(){
        return orderDao.getAll();
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void setDishDao(DishDAO dishDao) {
        this.dishDao = dishDao;
    }

    public void setOrderDao(OrderDAO orderDao) {
        this.orderDao = orderDao;
    }

}
