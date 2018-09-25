package app.mrquan.pojo;

public class Book {
    private String id;
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "ID:"+id+"\t名字:"+name+"\t价格:"+price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
