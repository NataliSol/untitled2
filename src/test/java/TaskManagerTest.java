import org.example.TaskManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    @DisplayName("перевірка методу чи додається завдання у список")
    void testCheckedAddingToList() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String A = "A";
        taskManager.addTask(A);
        String expected = "A";
        assertEquals(A, taskManager.getTasksList().get(0), "Результат додавання невірний");

    }

    @Test
    @DisplayName("перевірка методу чи не додається пусте завдання")
    void testAddEmptyTask() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String A = "";
        assertFalse(taskManager.addTask(A));
    }
    @Test
    @DisplayName("перевірка методу чи успішно видаляється існуюче завдання.")
    void testCheckedRemoveIsSuccessful() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String A = "";
        taskManager.addTask(A);
        assertEquals(0, taskManager.getTasksList().size(), "Результат видалення невірний");
    }
    @Test
    @DisplayName("перевірка методу чи успішно видаляється існуюче завдання.")
    void testRemoveTask() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String A = "A";
        taskManager.addTask(A);
        taskManager.removeTask(A);
        assertEquals(0, taskManager.getTasksList().size(), "не успішно видаляється існуюче завдання");
    }
    @Test
    @DisplayName("перевірка, що метод повертає false, якщо завдання не існує.")
    void testRemoveNonExistentTask() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String empty = "";
        assertFalse(taskManager.addTask(empty), "не повертає false, якщо завдання не існує.");
    }
    @Test
    @DisplayName("перевіряє, що метод повертає правильний список завдань.")
    void testGetTasks() {
        TaskManager taskManager = new TaskManager(new ArrayList<>());
        String a = "A";
        String b = "B";
        taskManager.addTask(a);
        taskManager.addTask(b);
        assertEquals(2, taskManager.getTasksList().size(), "повертає не правильний список завдань");
        assertEquals(a, taskManager.getTasksList().get(0), "повертає не правильний список завдань");
        assertEquals(b, taskManager.getTasksList().get(1), "повертає не правильний список завдань");

    }
}