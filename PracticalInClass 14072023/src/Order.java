import java.util.ArrayList;

public class Order{
    private String order_id;
    private String date;
    private String cus_name;
    private String cus_address;
    
    ArrayList prod_list = new ArrayList();

    public Order(String order_id, String date, String cus_name, String cus_address) {
        this.order_id = order_id;
        this.date = date;
        this.cus_name = cus_name;
        this.cus_address = cus_address;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public ArrayList getProd_list() {
        return prod_list;
    }

    public void setProd_list(ArrayList prod_list) {
        this.prod_list = prod_list;
    }
}