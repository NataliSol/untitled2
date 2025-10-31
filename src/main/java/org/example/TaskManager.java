package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager(List<String> tasks) {
        this.tasks = new ArrayList<>(tasks); // создаём копию переданного списка
    }


    public boolean addTask(String task) {
        boolean result;
        if (!task.isEmpty()) {
            tasks.add(task);
          result=true;
        } else
       result=false;
        return result;
    }

    public boolean removeTask(String task) {
        if (tasks.remove(task)) {
        }
        return true;
    }

    public List<String> getTasksList() {
        return tasks;
    }
}
