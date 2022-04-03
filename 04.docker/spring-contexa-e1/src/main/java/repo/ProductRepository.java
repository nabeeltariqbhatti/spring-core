package repo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 6:05 PM
 */

@Repository
public class ProductRepository {

    public void add(){
        System.out.println(" a new project was added");
    }
}
