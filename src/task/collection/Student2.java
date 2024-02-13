package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
    // TODO: Учет посещаемости:
    //  Создайте класс Student с полями name и attendance.
    //  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
    //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
    String name;
    int attendance;

    public Student2(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    public static List<Student2> getListStudentWithWorstAttendance(List<Student2> list, int worstAttendance) {
        List<Student2> studentList = new ArrayList<>();
        for (Student2 student : list) {
            if (student.attendance <= worstAttendance) {
                studentList.add(student);
            }
        }
        return studentList;
    }

    //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
    public static double getAverageAttendance(List<Student2> list) {
        int sum = 0;
        for (Student2 student : list) {
            sum += student.attendance;
        }
        return (double) sum / (double) list.size();
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2("Roman", 26);
        Student2 student4 = new Student2("Ivan", 10);
        Student2 student2 = new Student2("Akim", 30);
        Student2 student3 = new Student2("Vadim", 15);
        List<Student2> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println(getListStudentWithWorstAttendance(studentList, 15));
        System.out.println(getAverageAttendance(studentList));
    }
}
