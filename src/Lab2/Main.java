package Lab2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
    }
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date dateToEnd1 = new Date(System.currentTimeMillis() + 100000);
    Date dateToEnd2 = new Date(System.currentTimeMillis() + 200000);
    Date dateToEnd3 = new Date(System.currentTimeMillis() + 300000);
    Task task1 = new Task("Poranna zmiana", "zmiana", Task.taskCategory.IN_PROGRESS, dateToEnd1.toString());
    Task() task2 = new Task("Daleka delegacja", "delegacja",Task.taskCategory.DONE, dateToEnd2.toString());
    Task() task3 = new Task("Zdrowe życie", "bieganie",Task.taskCategory.NEW, dateToEnd3.toString());
    Date dateToEnd4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90));
    Task task4 = new Task("Szybka jazda", "jazda", Task.taskCategory.NEW, dateToEnd4.toString());

    List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (task task : taskList) {
        System.out.println(task.toString());
    }
}
