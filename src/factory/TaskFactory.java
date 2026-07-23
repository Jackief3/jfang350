package factory;

import task.Task;
import validator.TaskValidator;

public interface TaskFactory {

    Task createTask(String title, String description);

    TaskValidator createValidator();

}