package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Product {
    // TODO: Учет товаров на складе:
    //  Создайте класс Product с полями id, name и quantity.
    //  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
    //  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static List<Product> getMissingProduct(List<Product> list) {
        List<Product> productList = new ArrayList<>();
        for (Product product : list) {
            if (product.quantity == 0) {
                productList.add(product);
            }
        }
        return productList;
    }

    public static int getTotalQuantity(List<Product> list) {
        int totalQuantity = 0;
        for (Product product : list) {
            totalQuantity += product.quantity;
        }
        return totalQuantity;
    }

}
