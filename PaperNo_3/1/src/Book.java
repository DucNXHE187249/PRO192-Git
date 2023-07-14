public class Book {
    // attribs
    private String title;
    private int price;

    // constructors
    public Book() {}
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // setters
    public void setPrice(int price) {this.price = price;}

    // getters 
    public String getTitle() {return title.toUpperCase();}
    public int getPrice() {return price;}
}
