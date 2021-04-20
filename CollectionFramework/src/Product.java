public class Product {
    public double id;
    public String name;
    public double price;
    public Product(String name, double id, double price){
        this.name = name;
        this.id = id ;
        this.price = price;
    }
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
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
    @Override
    public String toString(){
        return "Name: "+this.name + " Id: "+this.id + " Price: "+this.price;
    }
}
