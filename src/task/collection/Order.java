package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Order implements Comparable<Order> {
    int id;
    String customer;
    int totalAmount;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }


    public static Order maxTotalAmount(List<Order> list) {
        list.sort(new TotalAmountComparator());
        return list.get(list.size() - 1);
    }

    public static int sumTotalAmount(List<Order> list) {
        Iterator<Order> iterator = list.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next().totalAmount;
        }
        return sum;
    }

    @Override
    public int compareTo(Order other) {
        return this.id - other.id;
    }

    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        Order order1 = new Order(25, "Roman", 2580);
        Order order2 = new Order(50, "Akim", 8580);
        Order order3 = new Order(26, "Vadim", 4550);
        list.add(order1);
        list.add(order3);
        list.add(order2);
        System.out.println(list);
        System.out.println(maxTotalAmount(list));
        System.out.println(sumTotalAmount(list));
        System.out.println(list);
    }
}
