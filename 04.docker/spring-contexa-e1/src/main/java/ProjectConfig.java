
import autowiredQualifieretc.Cat;
import autowiredQualifieretc.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 5:19 PM
 */

@Configuration
@ComponentScan(basePackages = {"repo","service"})
public class ProjectConfig {

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("tom");
        return cat;
    }

    @Bean
    @Primary
    public Cat cat2(){
        Cat cat = new Cat();
        cat.setName("leo");
        return cat;
    }
    @Bean
    public Owner owner(Cat cat){
        Owner owner = new Owner();
        owner.setCat(cat);
        return owner;
    }

//    @Bean
//    public MyBean myBean(){
//        System.out.println(this.getClass() + " I created this bean for your");
//        return new MyBean();
//    }


}
