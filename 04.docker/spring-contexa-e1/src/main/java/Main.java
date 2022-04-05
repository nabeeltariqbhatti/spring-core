
import autowiredQualifieretc.Cat;
import autowiredQualifieretc.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductDeliveryService;

import java.util.concurrent.Callable;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 5:14 PM
 */


public class Main {

    /**
     * XML
     * Annotations
     * @param args
     */






    public static void main(String[] args) {
        /**
         * this tells the spring @param ProjectConfig.class is the configuration class
         */

        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class);




        ){
            ProductDeliveryService bean = context.getBean(ProductDeliveryService.class);
            bean.addProducts();

        }catch (Exception exception){
            exception.printStackTrace();
        }

        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class);){
            Owner bean = context.getBean(Owner.class);
            Cat cat = context.getBean(Cat.class);
            System.out.println(bean);
        }
    }
}
