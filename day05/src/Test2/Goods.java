package Test2;

public class Goods {
    private int id,stock;
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(int id, String name, double price,int stock) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
