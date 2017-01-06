package go.it.dao;

import go.it.model.Orders;

import java.util.List;

/**
 * Created by Andrew on 25.12.2016.
 */
public interface OrderDAO {
    void  save(Orders order);
    List<Orders> getAll();

}
