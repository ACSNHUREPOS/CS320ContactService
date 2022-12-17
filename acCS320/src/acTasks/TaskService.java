package acTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService {


    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        TaskService service = new TaskService();


        service.addTask(new Task("0000000001", "Task 1", "Descriptive Description"));
        service.addTask(new Task("0000000002", "Task 2", "Descriptive Description"));
        service.addTask(new Task("0000000003", "Task 3 ", "Descriptive Description"));

        // display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }

        // create an existing task ID
        service.addTask(new Task("0000000001", "Task", "Descriptive Description"));

        System.out.println("Delete Task ID #0000000002");
        service.deleteTask("0000000002");
        System.out.println("Update Task ID #0000000003");
        service.update(new Task("0000000003", "Working ", "Working on a project"));

        // display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    /**
     *
     * @param task -
     *
     *
     * 
     */
    public boolean addTask(Task task) {

        int index = getIndex(task);

        // validate id if doesn't exist, name & description
        if (index < 0 && validateID(task.getId()) && validateName(task.getName())
                && validateDescription(task.getDescription())) {
            tasks.add(task);
            return true;
        }

        return false;
    }

    /**
     *
     * @param id
     *
     */
    public void deleteTask(String id) {

        int index = getIndex(new Task(id, "", ""));

        // check if index is greater than or equal to 0 to prevent
        // ArrayIndexOutOfBoundsException
        if (index >= 0)
            tasks.remove(index);
    }

    /**
     *
     * @param task
     * 
     *             update Task object if same ID and valid name and description
     */
    public void update(Task task) {
        for (Task obj : tasks) {
            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
                obj.setName(task.getName());
                obj.setDescription(task.getDescription());
            }
        }
    }

    /**
     *
     * @param task
     * @return
     */
    public int getIndex(Task task) {
        int index = Collections.binarySearch(tasks, task, Task.compareById);
        return index;
    }

    /**
     * 
     * @param id
     * @return true or false
     * 
     */
    public boolean validateID(String id) {
        if (id != null && id.length() <= 10)
            return true;

        return false;
    }

    /**
     * 
     * @param name
     * @return true or false
     * 
     */
    public boolean validateName(String name) {
        if (name != null && name.length() <= 20)
            return true;

        return false;
    }

    /**
     * 
     * @param description
     * @return true or false
     * 
     */
    public boolean validateDescription(String description) {
        if (description != null && description.length() <= 50)
            return true;

        return false;
    }
}