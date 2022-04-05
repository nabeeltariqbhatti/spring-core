
import autowiredQualifieretc.Cat;
import autowiredQualifieretc.Owner;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 5:19 PM
 */

@Configuration
@ComponentScan(basePackages = {"repo","service"})
public class ProjectConfig {


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;

    }

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
