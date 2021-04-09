package Lab2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

        //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html#of-int-int-int-int-int-
        LocalDateTime dateToEnd1 = LocalDateTime.of(2020, 12, 10, 12, 00); //new LocalDateTime(System.currentTimeMillis() + 100000);
        LocalDateTime dateToEnd2 = LocalDateTime.of(2020, 05, 03, 12, 05);//new LocalDateTime(System.currentTimeMillis() + 200000);
        LocalDateTime dateToEnd3 = LocalDateTime.of(2021, 01, 10, 12, 00);//new LocalDateTime(System.currentTimeMillis() + 300000);
        Task task1 = new Task("Poranna zmiana", "zmiana", Task.TaskCategory.IN_PROGRESS, dateToEnd1);
        Task task2 = new Task("Daleka delegacja", "delegacja",Task.TaskCategory.DONE, dateToEnd2);
        Task task3 = new Task("Zdrowe życie", "bieganie",Task.TaskCategory.NEW, dateToEnd3);


        LocalDateTime dateToEnd4 = LocalDateTime.of(2020, 12, 10, 12, 00);
        Task task4 = new Task("Szybka jazda", "jazda", Task.TaskCategory.NEW, dateToEnd4);

        task4.setTaskDateTimeStop(dateToEnd4.plusMonths(3));

        ArrayList<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}