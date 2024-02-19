package task.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Students1 {
    // TODO: Создание списка студентов:
    //  Создайте класс Student с полями name и age.
    //  Создайте метод, который будет принимать список студентов и выводить их на экран.
    //  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.
    String name;
    int age;

    public Students1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students1 students = (Students1) o;
        return age == students.age && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void getStudents(List<Students1> list) {
        System.out.println(list);
    }

    public static List<Students1> getStudentsByAge(List<Students1> list, int age) {
        List<Students1> listStudents = new ArrayList<>();
        for (Students1 student : list) {
            if (student.age > age) {
                listStudents.add(student);
            }
        }
        return listStudents;
    }

    public static void main(String[] args) {
        Students1 student1 = new Students1("Akim", 26);
        Students1 student2 = new Students1("Vadim", 25);
        Students1 student3 = new Students1("Roman", 37);
        List<Students1> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        getStudents(listStudents);
        System.out.println(getStudentsByAge(listStudents, 30));

    }
}
