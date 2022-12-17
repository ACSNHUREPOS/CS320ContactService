package taskTests;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import acTasks.Task;

public class TaskTest {

   // test that taskId is not null
   @Test
   public void testTaskIdNotNull() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertNotNull(task.getId());
   }

   // test that taskId is not empty
   @Test
   public void testTaskIdNotEmpty() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertFalse(task.getId().isEmpty());
   }

   // test that task id cannot be more than 10 digits
   @Test
   public void testTaskIdLength() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertTrue(task.getId().length() <= 10);
   }

   // test that task name is not null
   @Test
   public void testTaskNameNotNull() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertNotNull(task.getName());
   }

   // test that task name is not empty
   @Test
   public void testTaskNameNotEmpty() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertFalse(task.getName().isEmpty());
   }

   // test that task name cannot be more than 20 characters
   @Test
   public void testTaskNameLength() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertTrue(task.getName().length() <= 20);
   }

   // test that task description is not null
   @Test
   public void testTaskDescriptionNotNull() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertNotNull(task.getDescription());
   }

   // test that task description is not empty
   @Test
   public void testTaskDescriptionNotEmpty() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertFalse(task.getDescription().isEmpty());
   }

   // test that task description cannot be more than 50 characters
   @Test
   public void testTaskDescriptionLength() {
      Task task = new Task("0000000001", "Task 1", "Descriptive Description");
      assertTrue(task.getDescription().length() <= 50);
   }
}
