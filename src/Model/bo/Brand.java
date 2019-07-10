package Model.bo;

import java.io.Serializable;

public class Brand extends Id implements Serializable {

    private String brand;

    public Brand() {
    }
    public Brand(String brand) {
        this.brand = brand;
    }
    public Brand(int id, String brand) {
        super(id);
        this.brand = brand;
    }
    public String getName() {
        return brand;
    }
    public void setName(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Brand{" + "Brand=" + brand + '}';
    }
}
