public class Product {
    private String product_name;
    private String product_id;
    private double product_value;

    public Product(String product_name, String product_id, double product_value) {
        this.product_name = product_name;
        this.product_id = product_id;
        this.product_value = product_value;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public double getProduct_value() {
        return product_value;
    }

    public void setProduct_value(double product_value) {
        this.product_value = product_value;
    }

    
}
