
import java.util.Objects;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    // Constructor
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product() {

    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int ProductIdIsCount(Product product){
        int count=0;
        for (int i = 0; i < 5; i++) {
            if (id == product.getId()) {
                count++;
            }

        }
        System.out.println(count);
        return count;

    }
    // equals() metodunu override edirik
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;

        // Yalnız ID əsas müqayisə meyarı kimi qəbul edilir
        return id == product.id;
    }

    // hashCode() metodu ID-yə əsaslanır
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString() metodu
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
    public static class NewProduct{

    }
}

    // equals() metodunu override edirik
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // Eyni obyekt olduqda true
//        if (obj == null || getClass() != obj.getClass()) return false; // Null və sinif fərqlərini yoxlayır
//
//        Product product = (Product) obj; // Cast edirik
//
//        // Sahələrin bərabərliyini yoxlayırıq
//        return Double.compare(product.price, price) == 0 &&
//                name.equals(product.name) &&
//                category.equals(product.category);
//    }

    // toString() metodu (Çıxışı asan oxumaq üçün)



