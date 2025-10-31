package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager=new TaskManager(new ArrayList<>());

        taskManager.addTask("уу");
       System.out.println(taskManager.getTasksList().size());
    }
}