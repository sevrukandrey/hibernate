package go.it.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Andrew on 25.12.2016.
 */
@Entity
@Table(name = "dish")
public class Dish {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public DishCategory getDishCategory() {
        return dishCategory;
    }

    public void setDishCategory(DishCategory dishCategory) {
        this.dishCategory = dishCategory;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    @Column(name = "id")
    private  long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private  Float price;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "dish_category")
    @Enumerated(EnumType.STRING)
    private DishCategory dishCategory;



}
