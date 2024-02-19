package task.collection;

import java.util.*;


public class Collection {
    public static void main(String[] args) {
        // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 2, 125, 8, 6, 8, 125, -25, 56);
        System.out.println("Список до изменений "+integerArrayList);

        // TODO: Найти наибольший элемент в списке.
        System.out.println("Максимальный элемент в списке: "+maxIntegerList(integerArrayList));

        // TODO: Удалить все дубликаты из списка.
        System.out.println("Список без дубликатов " +deleteDuplicatesListInteger(integerArrayList));

        // TODO: Отсортировать список в порядке убывания.
        System.out.println("Отсортировать список в порядке убывания "+sortDescendingOrderListInteger(integerArrayList));

        // TODO: Проверить, содержит ли множество определенный элемент.
        Set<String> set=new HashSet<>();
        set.add("Roman");
        set.add("Vadim");
        set.add("Akim");
        System.out.println(containSetElement(set,"Roman"));

        // TODO: Найти пересечение двух множеств.
        HashSet<Integer>setInteger1=new HashSet<>();
        setInteger1.add(1);
        setInteger1.add(2);
        setInteger1.add(5);
        HashSet<Integer>setInteger2=new HashSet<>();
        setInteger2.add(2);
        setInteger2.add(5);
        setInteger2.add(6);
        System.out.println(setInteger1+"\n"+setInteger2);
        System.out.println("Пересечение множеств "+getIntersectionOfTwoSets(setInteger1,setInteger2));
        System.out.println("Разница множеств "+getSubtractTwoSets(setInteger1,setInteger2));

        // TODO: Проверить, содержит ли карта определенный ключ.
        Map<Integer,Student>map=new HashMap<>();
        Student studentFirst=new Student("Roman","Dovzhenko",2);
        Student studentSecond=new Student("Akim","Parizh",4);
        Student studentThree=new Student("Vadim","Vadboom",1);
        map.put(25,studentFirst);
        map.put(50,studentSecond);
        map.put(125,studentThree);
        System.out.println(map);
        System.out.println(getMapContainKey(map,50));

        // TODO: Получить все значения, связанные с определенным ключом.
        System.out.println(getValueByKey(map,50));

        // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
        Student student=new Student("Roman","Dovzhenko",2);
//        deleteValueMapByValue(map,student);
        System.out.println(map);
//        deleteValueMapByValue(map,student);
        deleteValueMapByValue_IteratorMethods(map,student);
        System.out.println(map);

        // TODO: Добавить элемент в очередь.
        Queue<String>queue=new LinkedList<>();
        addElementInQueueString(queue,"Roman");
        addElementInQueueString(queue,"Akim");
        addElementInQueueString(queue,"Vadim");
        System.out.println(queue);
        // TODO: Получить и удалить первый элемент из очереди.
        System.out.println(removeElementInQueueString(queue));
        System.out.println(queue);
        // TODO: Проверить, пуста ли очередь.
        System.out.println(isEmptyQueue(queue));
    }

    // Реализуйте функциональность согласно описанию

    // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

    // TODO: Найти наибольший элемент в списке.
    public static int maxIntegerList(List<Integer> list){
        return Collections.max(list);
    }
    // TODO: Удалить все дубликаты из списка.
    public static List<Integer> deleteDuplicatesListInteger(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(list, iterator.next()) > 1) {
                iterator.remove();
            }
        }
        return list;
    }
    // TODO: Отсортировать список в порядке убывания.
    public static List<Integer> sortDescendingOrderListInteger(List<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
    // TODO: Проверить, содержит ли множество определенный элемент.
    public static boolean containSetElement(Set<String> set, String string){
        return set.contains(string);
    }
    // TODO: Найти пересечение двух множеств.
    public static Set<Integer> getIntersectionOfTwoSets(Set<Integer> setFirst,Set<Integer> setSecond){
        Set<Integer> intersection = new HashSet<>(setFirst);
        intersection.retainAll(setSecond);
        return intersection;
    }
    // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
    public static Set<Integer> getSubtractTwoSets(Set<Integer> setFirst, Set<Integer> setSecond){
        Set<Integer> subtract=new HashSet<>(setFirst);
        subtract.removeAll(setSecond);
        return subtract;
    }
    // TODO: Проверить, содержит ли карта определенный ключ.
    public static boolean getMapContainKey(Map<Integer,Student> map,Integer integer){
        return map.containsKey(integer);
    }
    // TODO: Получить все значения, связанные с определенным ключом.
    public static Student getValueByKey(Map<Integer,Student> map, Integer integer){
        return map.get(integer);
    }
    // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
    public static void deleteValueMapByValue(Map<Integer,Student> map, Student student){
        Map<Integer,Student>mapCopy=new HashMap<>(map);
        for (Map.Entry<Integer, Student> entry:mapCopy.entrySet()){
            if(entry.getValue().equals(student)){
                map.remove(entry.getKey());
            }
        }
    }
    public static void deleteValueMapByValue_IteratorMethods(Map<Integer,Student> map, Student student){
        Iterator<Map.Entry<Integer,Student>> mapIterator=map.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry<Integer, Student> entry=mapIterator.next();
            if (entry.getValue().equals(student)){
                mapIterator.remove();
            }
        }
    }
    // TODO: Добавить элемент в очередь.
    public static void addElementInQueueString(Queue<String> queue, String element){
        queue.add(element);
    }
    // TODO: Получить и удалить первый элемент из очереди.
    public static String removeElementInQueueString(Queue<String> queue){
        return queue.remove();
    }
    // TODO: Проверить, пуста ли очередь.
    public static boolean isEmptyQueue(Queue<String> queue){
        return queue.isEmpty();
    }
    // TODO: Учет заказов:
    //  Создайте класс Order с полями id, customer и totalAmount.
    //  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
    //  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

    // TODO: Управление задачами:
    //  Создайте класс Task с полями id, title и completed.
    //  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
    //  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

    // TODO: Создание списка студентов:
    //  Создайте класс Student с полями name и age.
    //  Создайте метод, который будет принимать список студентов и выводить их на экран.
    //  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

    // TODO: Учет товаров на складе:
    //  Создайте класс Product с полями id, name и quantity.
    //  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
    //  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

    // TODO: Учет посещаемости:
    //  Создайте класс Student с полями name и attendance.
    //  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
    //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
}