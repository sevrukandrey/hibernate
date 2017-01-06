package go.it.dao;

import go.it.model.Dish;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
public interface DishDAO {
    void save(Dish dish);
    List<Dish> getAll();
    Dish findByName(String name);
}
