package autowiredQualifieretc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/4/2022
 * @Time at 10:38 PM
 */

@Component
public class Owner {


    @Autowired(required = false)
    private   Cat cat;
    public Cat getCat() {
        return cat;
    }



    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }
}
