package go.it.model;

import go.it.model.Dish;
import go.it.model.Employee;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "order_id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employee waiter;

    @ManyToMany
    @JoinTable(
            name = "dish_order",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_id")
    )

    private List<Dish> dishes;

    @Column(name = "table_number")
    private int tablenumber;
    @Column(name = "order_date")
    private Date orderDate;

    public List<Dish> getDishes() {
        return dishes;
    }



    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee getWaiter() {
        return waiter;
    }

    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }


    public int getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(int tablenumber) {
        this.tablenumber = tablenumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


}
