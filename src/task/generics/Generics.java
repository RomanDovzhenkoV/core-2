package task.generics;

import task.models.BigBox;
import task.models.MediumBox;
import task.models.MicroBox;
import task.models.SmallBox;

import java.util.ArrayList;
import java.util.List;

public class Generics <T extends BigBox>{
    public static <T> boolean containsBox(List<T>list, T t){
      return list.contains(t);
    }
    public static <T> void addBox(List<T>list, T t){
      list.add(t);
    }
    public static <T> void infoListBox(List<T>list){
      System.out.println(list);
    }
    public static <T> void copyingBoxesFromOneListToAnother(List<T>listFirst,List<T>listSecond){
      listFirst.addAll(listSecond);
    }

  public static void main(String[] args) {

    List<BigBox> producer=new ArrayList<>();
    producer.add(generateBigBox());
    producer.add(generateMediumBox());
    producer.add(generatMicroBox());
    producer.add(generatMicroBox());

    BigBox microBox=generatMicroBox();
    BigBox smallBox=generatSmallBox();

    List<BigBox> consumer=new ArrayList<>();
    addBox(consumer,microBox);

    infoListBox(producer);
    infoListBox(consumer);
    System.out.println(containsBox(producer,microBox));
    System.out.println(containsBox(producer,smallBox));
    copyingBoxesFromOneListToAnother(consumer,producer);
    infoListBox(consumer);





  }

  //TODO: реализуйте Метод для проверки наличия коробки в списке (Producer)

  //TODO: реализуйте Метод для добавления коробок в список (Consumer)

  //TODO: реализуйте Метод для печати списка коробок (Producer)

  //TODO: реализуйте Метод для копирования коробок из одного списка в другой (Producer и Consumer)

  private static BigBox generateBigBox() {
    BigBox bigBox = new BigBox();
    bigBox.setMediumBox(generateMediumBox());
    bigBox.setHeight(20);
    bigBox.setLength(20);
    bigBox.setSize("big");
    bigBox.setWidth(20);
    return bigBox;
  }

  private static MediumBox generateMediumBox() {
    MediumBox mediumBox = new MediumBox();
    mediumBox.setSmallBox(generatSmallBox());
    mediumBox.setHeight(15);
    mediumBox.setLength(15);
    mediumBox.setSize("medium");
    mediumBox.setWidth(15);
    return mediumBox;
  }

  private static SmallBox generatSmallBox() {
    SmallBox smallBox = new SmallBox();
    smallBox.setMicroBox(generatMicroBox());
    smallBox.setHeight(10);
    smallBox.setLength(10);
    smallBox.setSize("small");
    smallBox.setWidth(10);
    return smallBox;
  }

  private static MicroBox generatMicroBox() {
    MicroBox microBox = new MicroBox();
    microBox.setHeight(5);
    microBox.setLength(5);
    microBox.setSize("small");
    microBox.setWidth(5);
    return microBox;
  }


}
