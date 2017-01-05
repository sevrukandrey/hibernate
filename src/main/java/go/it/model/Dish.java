package go.it.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;




@Entity
public class Dish {

    public Dish(int id, String name, int price, int weight, DishCategory dishCategory) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.dishCategory = dishCategory;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", dishCategory=" + dishCategory +
                '}';
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")

    @Column(name = "dish_id")
    public   int id;

    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public  int price;

    @Column(name = "weight")
    public int weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "dish_category")
    public DishCategory dishCategory;


}
/*
    CREATE TABLE dish
        (
                dish_id numeric NOT NULL,
                name character varying,
                price numeric,
                weight numeric,
  "'dish_category'" character varying,
                CONSTRAINT dish_pkey PRIMARY KEY (dish_id)
)

        CREATE TABLE dish_order
        (
        dish_id integer NOT NULL,
        order_id integer NOT NULL,
        CONSTRAINT dish_order_dish_id_fkey FOREIGN KEY (dish_id)
        REFERENCES dish (dish_id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION,
        CONSTRAINT dish_order_order_id_fkey FOREIGN KEY (order_id)
        REFERENCES orders (order_id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION
        )





        CREATE TABLE orders
        (
        order_id serial NOT NULL,
        employer_id integer,
        table_number integer,
        order_date date NOT NULL,
        CONSTRAINT orders_pkey PRIMARY KEY (order_id),
        CONSTRAINT orders_employer_id_fkey FOREIGN KEY (employer_id)
        REFERENCES employee (employee_id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION
        )
*/