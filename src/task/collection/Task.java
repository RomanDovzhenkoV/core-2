package task.collection;

import java.util.*;

public class Task {
    // TODO: Управление задачами:
    //  Создайте класс Task с полями id, title и completed.
    //  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.

    int id;
    String title;
    boolean completed;

    public Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && completed == task.completed && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, completed);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public static List<Task> getListUnfinishedTasks(List<Task> list) {
        List<Task> unfinishedTasks = new ArrayList<>();
        for (Task task : list) {
            if (!task.completed) {
                unfinishedTasks.add(task);
            }
        }
        return unfinishedTasks;
    }

    //  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.
    public static List<Task> getListTasksWisSpecificTitle(List<Task> list, String title) {
        List<Task> tasksByTitle = new ArrayList<>();
        for (Task task : list) {
            if (task.title.equals(title)) {
                tasksByTitle.add(task);
            }
        }
        return tasksByTitle;
    }


    public static void main(String[] args) {
        Task task1 = new Task(25, "Разгрузка собственных машин", true);
        Task task4 = new Task(25, "Загрузка собственных машин", false);
        Task task2 = new Task(26, "Разгрузка наемных машин", false);
        Task task5 = new Task(50, "Уборка помещений", true);
        Task task3 = new Task(27, "Загрузка наемных машин", false);
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        System.out.println(tasks);
        System.out.println(getListUnfinishedTasks(tasks));
        System.out.println(getListTasksWisSpecificTitle(tasks, "Уборка помещений"));

    }


}
