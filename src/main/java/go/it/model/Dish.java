package go.it.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;




@Entity
public class Dish {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        if (price != dish.price) return false;
        if (weight != dish.weight) return false;
        if (name != null ? !name.equals(dish.name) : dish.name != null) return false;
        return dishCategory == dish.dishCategory;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + (dishCategory != null ? dishCategory.hashCode() : 0);
        return result;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")

    @Column(name = "dish_id")
    private    int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private  int price;

    @Column(name = "weight")
    private int weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "dish_category")
    private DishCategory dishCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DishCategory getDishCategory() {
        return dishCategory;
    }

    public void setDishCategory(DishCategory dishCategory) {
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