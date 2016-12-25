package go.it.controler;

import go.it.dao.DishDAO;
import go.it.model.Dish;
import go.it.model.DishCategory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Andrew on 25.12.2016.
 */
public class DishController {

    private DishDAO dishDAO;

    public void createDish() {


        Dish sup = new Dish();
        sup.setName("sup");
        sup.setDishCategory(DishCategory.MAIN);
        sup.setPrice(6.00F);
        sup.setWeight(500.00F);

        Dish salat = new Dish();
        salat.setName("sup");
        salat.setDishCategory(DishCategory.MAIN);
        salat.setPrice(6.00F);
        salat.setWeight(500.00F);

        Set<Dish> dishes = new HashSet<Dish>(dishDAO.getAll());
        if (!dishes.contains(salat)) {
            dishDAO.save(salat);
        }
        if (!dishes.contains(sup)) {
            dishDAO.save(sup);
        }
    }

    public List<Dish> getAllDish(){
        return dishDAO.getAll();
    }

    public void setDishDAO(DishDAO dishDAO) {
        this.dishDAO = dishDAO;
    }
}
