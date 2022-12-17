package taskTests;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import acTasks.Task;
import acTasks.TaskService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskServiceTest {

    public static List<Task> tasks = new ArrayList<>();

    // Update a task
    @Test
    public void updateTask() {
        TaskService service = new TaskService();
        service.addTask(new Task("0000000001", "Task 1", "Descriptive Description"));
        service.addTask(new Task("0000000002", "Task 2", "Descriptive Description"));
        service.addTask(new Task("0000000003", "Task 3 ", "Descriptive Description"));
        service.update(new Task("0000000003", "Working ", "Working on a project"));
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    // Delete a task
    @Test
    public void deleteTask() {
        TaskService service = new TaskService();
        service.addTask(new Task("0000000001", "Task 1", "Descriptive Description"));
        service.addTask(new Task("0000000002", "Task 2", "Descriptive Description"));
        service.addTask(new Task("0000000003", "Task 3 ", "Descriptive Description"));
        service.deleteTask("0000000002");
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    // Delete a task via task id
    @Test
    public void deleteTaskById() {
        TaskService service = new TaskService();
        service.addTask(new Task("0000000001", "Task 1", "Descriptive Description"));
        service.addTask(new Task("0000000002", "Task 2", "Descriptive Description"));
        service.addTask(new Task("0000000003", "Task 3 ", "Descriptive Description"));
        service.deleteTask("0000000002");
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    // Update a task name or description
    @Test
    public void updateTaskNameOrDescription() {
        TaskService service = new TaskService();
        service.addTask(new Task("0000000001", "Task 1", "Descriptive Description"));
        service.addTask(new Task("0000000002", "Task 2", "Descriptive Description"));
        service.addTask(new Task("0000000003", "Task 3 ", "Descriptive Description"));
        service.update(new Task("0000000003", "Working ", "Working on a project"));
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }
}
