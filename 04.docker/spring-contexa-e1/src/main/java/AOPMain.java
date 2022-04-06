import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.HelloService;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/6/2022
 * @Time at 10:52 PM
 */


public class AOPMain {


    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class);) {

            HelloService helloService = context.getBean(HelloService.class);
            System.out.println(helloService.hello("Nabeel "));
//            helloService.hello("Nabeel Rajput ", "Husnain Rajput");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
