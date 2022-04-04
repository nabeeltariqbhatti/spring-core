package autowiredQualifieretc;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/4/2022
 * @Time at 10:38 PM
 */
public class Owner {

    private Cat cat;

    public Owner(){

    }
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
