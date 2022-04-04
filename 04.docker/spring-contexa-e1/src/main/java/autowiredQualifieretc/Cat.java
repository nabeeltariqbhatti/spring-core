package autowiredQualifieretc;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/4/2022
 * @Time at 10:38 PM
 */
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


}
