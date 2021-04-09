package Lab2;

import java.time.LocalDateTime;

public class Task {
    public enum taskCategory {
        NEW, IN_PROGRESS, DONE
    }
public class Task {
    private String taskName;
    private String taskDescription;
    private taskCategory taskCategory;
    private String taskDateTimeStart;
    private String taskDateTimeStop;

    public Task (String taskName, String taskDescription, taskCategory taskCategory, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;


        public String toString() {
            return "Name: " + taskName + ", Description: " + taskDescription + ", Category: " + taskCategory.name() +
                    ", Time start: " + taskDateTimeStart + ", Time stop: " + taskDateTimeStop;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public taskCategory getTaskCategory() {
            return taskCategory;
        }

        //  public String getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public String getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskCategory(taskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskDateTimeStart(String taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public void setTaskDateTimeStop(String taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }
}
