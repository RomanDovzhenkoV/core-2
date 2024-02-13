package task.collection;

import java.util.Comparator;

public class TotalAmountComparator implements Comparator<Order> {

    @Override
    public int compare(Order orderFirst, Order orderSecond) {
        return orderFirst.totalAmount - orderSecond.totalAmount;
    }
}
