import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repo.ProductRepository;

import java.util.List;


/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/5/2022
 * @Time at 10:41 PM
 */


enum O{

    DK(List.of("alpha"));


    private final List<String> les;






    O(List<String> les) {
        this.les = les;
    }
}

public class JdbcMain {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductRepository repository = context.getBean(ProductRepository.class);
            repository.addProduct(new Product().setName("Jersey").setPrice(12));
            System.out.println(repository.getProducts().size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
