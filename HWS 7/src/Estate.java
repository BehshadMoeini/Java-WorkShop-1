public class Estate extends Owner{

    private double width, length, price;
    private String address , type;
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.toLowerCase().equals("land") ||
               type.toLowerCase().equals("unit") ) {
            this.type = type.toLowerCase();
        } else {
            this.type = "Not Defined!";
        }
    }
    
    @Override
    public String toString() {
        return String.format("Estate In %s, %.2f x %.2f, Owner: %s %nPrice: %.2f , Type Of estate: %s",
                getAddress(), getLength(), getWidth(), super.toString() , getPrice(),getType());
    }
}
