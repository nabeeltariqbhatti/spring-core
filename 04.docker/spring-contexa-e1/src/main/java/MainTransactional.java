
import autowiredQualifieretc.Cat;
import autowiredQualifieretc.Owner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductDeliveryService;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 5:14 PM
 */


public class MainTransactional {



    public static void main(String[] args) {
        /**
         * this tells the spring @param ProjectConfig.class is the configuration class
         */

        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class);){


        }catch (Exception exception){
            exception.printStackTrace();
        }


    }
}
