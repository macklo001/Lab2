package Lab2;

import java.time.LocalDateTime;

public class Subtask  extends Task {
    public Subtask(String name, String description, TaskCategory category, LocalDateTime dateTimeStop) {
        super(name, description, category, dateTimeStop);
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public String subtaskName;


    }
}
