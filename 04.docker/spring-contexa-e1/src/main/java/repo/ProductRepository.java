package repo;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 6:05 PM
 */

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add() {
    }

    public void addProduct(Product product) {


        //if all the values are inserted and the attributes whose default values are set then you don't need to specify names
        //otherwise specify names

//        other way "insert into product values(NUL,?,?)";
        String sql = "insert into product (name,price) values(?,?)";

        jdbcTemplate.update(sql, product.getName(), product.getPrice());




    }
   public List<Product> getProducts(){
        String sql="select * from product";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

                Product product = new Product();

                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                return product;
            }
        });
    }

}
