
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 5:19 PM
 */

@Configuration
@ComponentScan(basePackages = {"repo","service"})
public class ProjectConfig {

//    @Bean
//    public MyBean myBean(){
//        System.out.println(this.getClass() + " I created this bean for your");
//        return new MyBean();
//    }


}
