package Lab2;

import java.time.LocalDateTime;

public class Task {

    public enum TaskCategory {
        NEW, IN_PROGRESS, DONE
    }

    public Task (String name, String description, TaskCategory category, LocalDateTime dateTimeStop) {
        this.taskName = name;
        this.taskDescription = description;
        this.taskCategory = category;
        this.taskDateTimeStop = dateTimeStop;
        this.taskDateTimeStart = LocalDateTime.now();
    }

    public String toString() {
        return "Name: " + this.taskName + ", Description: " + this.taskDescription + ", Category: " + this.taskCategory.name() + ", Time start: " + this.taskDateTimeStart + ", Time stop: " + this.taskDateTimeStop;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }
    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    private String taskName;
    private String taskDescription;
    private TaskCategory taskCategory;
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;
}
