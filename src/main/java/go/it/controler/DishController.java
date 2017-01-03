package go.it.controler;

import go.it.dao.DishDAO;
import go.it.model.Dish;
import go.it.model.DishCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Andrew on 25.12.2016.
 */
public class DishController {


    private DishDAO dishDAO;

    public void createDish() {

        System.out.println("1");
        Dish sup = new Dish();
        sup.setId(1);
        sup.setName("sup");
        //sup.setDishCategory(DishCategory.MAINA);
        sup.setPrice(6);
        sup.setWeight(5);
        System.out.println("1");




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
