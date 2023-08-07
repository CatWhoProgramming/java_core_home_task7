package Task3;

public class Price implements Comparable<Price> {
    String name;
    String shop;
    double price;

    Price(String name, String shop, double price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {
        return shop.compareTo(o.shop);
    }

    public String toString() {
        return name + " " + shop + " " + price;
    }
}
