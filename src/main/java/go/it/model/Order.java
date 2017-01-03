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
@Table(name = "order")
public class Order {
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
            joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private List<Dish> dishes;
    @Column(name= "table_number")
    private int tablenumber;
    @Column(name="order_date")
    private Date orderDate;

}
