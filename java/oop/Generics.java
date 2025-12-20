void main() {
    // Generics - Write a class, interface, or method compatible with different data types
    // <Product> type argument (specifies the type)
    Inventory<Product> phones = new Inventory<>();

    // Generics type argument can have multiple types
    Product<String, Integer> xiaomi = new Product<>("Xiaomi 15", 590);
    Product<String, Long> samsung = new Product<>("Samsung S25", 799L);
    Product<String, Float> pixel = new Product<>("Google Pixel 10", 799.99F);
    Product<String, Double> iphone = new Product<>("Apple iPhone 17", 699.99);

    phones.setInventory(xiaomi, samsung, pixel, iphone);
    phones.setDiscount(24.49F); // Only objects that extends 'Number' class (Integer, Double, etc.)

    // Wildcards <?> accept a range of types to work with
    for (Product<?, ?> phone : phones.getInventory()) {
        IO.println(phone.getItem() + " —— $" + phone.getPrice());
    }
}

// <T> type parameter (placeholder that gets replaced with the real type)
class Inventory<T> implements Discount {

    T[] inventory;

    public void setInventory(T ... items){
        this.inventory = items;
    }

    public T[] getInventory(){
        return inventory;
    }

    @Override
    public void setDiscount(Number discountPercentage) {
        IO.println("\nNew voucher discount for " + inventory.length + " items!");
        IO.println("Exclusive Discount: " + discountPercentage + "%");
    }
}

// Bounded Generics - Restrict type parameters to a certain hierarchy:
// <U> can only accept class that extends 'Number' class
class Product<T, U extends Number> {
    Product<T, U>[] products;
    T item;
    U price;

    public Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}

interface Discount<T extends Number> {
    void setDiscount(T discount);
}