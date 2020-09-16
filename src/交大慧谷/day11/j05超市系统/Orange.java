package 交大慧谷.day11.j05超市系统;

public class Orange implements Fruit{
    private String name;
    private int price;

    public Orange(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
