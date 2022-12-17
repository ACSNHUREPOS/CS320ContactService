package acTasks;

import java.util.Comparator;

public class Task {

    // private access modifier for encapsulation
    private String taskID;
    private String taskName;
    private String tDescription;

    // public constructor of Task object accepting 3 String parameters
    public Task(String taskID, String taskName, String tDescription) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.tDescription = tDescription;
    }

    // public getters to get the value of private variable
    public String getId() {
        return taskID;
    }

    // public setters to set the value of private variable
    public void setId(String taskID) {
        this.taskID = taskID;
    }

    public String getName() {
        return taskName;
    }

    public void setName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return tDescription;
    }

    public void setDescription(String tDescription) {
        this.tDescription = tDescription;
    }

    /**
     * 
     * @param obj
     * @return true | false
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Task t = (Task) obj;
        return getId().equals(t.getId());
    }

    /**
     * use Comparator interface
     * override the compare method comparing the taskID variable of two Task object
     */
    public static Comparator<Task> compareById = new Comparator<Task>() {
        @Override
        public int compare(Task t1, Task t2) {
            return t1.getId().compareTo(t2.getId());
        }
    };

    /**
     * @return String data type concatenated String value of Task object
     *         displaying the taskID, taskNand tDescription
     */
    @Override
    public String toString() {
        return "Task ID: " + getId() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }

}