package repo;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     *REQUIRES,
     * REQUIRES_NEW
     * MANDATORY,
     * NEVER
     * SUPPORTS
     * NOT_SUPPORTED
     * NESTED-----> spring specific
     */

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add() {
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addProduct(Product product) {

        //if all the values are inserted and the attributes whose default values are set then you don't need to specify names
        //otherwise specify names

//        other way "insert into product values(NUL,?,?)";
        String sql = "insert into product (id,name,price) values(NULL,?,?)";

        jdbcTemplate.update(sql, product.getName(), product.getPrice());
//        throw new RuntimeException(":(");




    }


    public List<Product> getProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException  {
                Product p = new Product();
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                return p;
            }
        });
    }

}
