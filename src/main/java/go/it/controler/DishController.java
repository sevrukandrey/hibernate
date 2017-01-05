package go.it.controler;

import go.it.dao.DishDAO;
import go.it.model.Dish;
import go.it.model.DishCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static go.it.model.DishCategory.MAINA;

/**
 * Created by Andrew on 25.12.2016.
 */
public class DishController {


    private DishDAO dishDAO;
    @Transactional
    public void createDish() {

       Dish sup = new Dish(1,"a",1,1,DishCategory.MAINA);

        // Set<Dish> dishes = new HashSet<Dish>(dishDAO.getAll());

       // if (!dishes.contains(sup)) {
            dishDAO.save(sup);
      //  }
    }
//@Transactional
  //  public List<Dish> getAllDish(){
     //   return dishDAO.getAll();
  //  }

    public void setDishDAO(DishDAO dishDAO) {
        this.dishDAO = dishDAO;
    }
}
