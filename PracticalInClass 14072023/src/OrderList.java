import java.util.ArrayList;

public class OrderList extends ArrayList <Order>{
    public OrderList(){
        super();
    }
    
    public Order search (String order_id){
        return null;
    }
    
    public void addOrder (){
        String newOrder_id, newDate, newCus_name, newCus_address;
        
        newOrder_id = Inputter.inputPattern("Order ID: OD0000", "[OD][\\d]{4}");
        newOrder_id.trim().toUpperCase();
        
        newDate = Inputter.inputPattern("Date: 00/00/0000", "[\\d]{2}[/][\\d]{2}[/][\\d]{4}");
        newCus_name = newCus_name;
        
    }
}