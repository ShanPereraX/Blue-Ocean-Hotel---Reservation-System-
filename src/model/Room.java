package model;

public class Room {
    String no;
    String type;
    Double price;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Room(String no, String type, Double price) {
        this.no = no;
        this.type = type;
        this.price = price;
    }
}
