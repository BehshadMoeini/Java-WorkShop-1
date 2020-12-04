public class Commodity {

    private String name, type, price;

    public Commodity() {
    }

    public Commodity(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Commodity(String name, String type, String price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Goods Name: %s ,Price: %s ,Type: %s", getName(), getPrice(), getType());
    }
}
