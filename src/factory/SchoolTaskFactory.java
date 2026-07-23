package factory;

import task.Task;
import task.SchoolTask;
import validator.TaskValidator;
import validator.SchoolTaskValidator;

public class SchoolTaskFactory implements TaskFactory {

    @Override
    public Task createTask(String title, String description) {
        return new SchoolTask(title, description);
    }

    @Override
    public TaskValidator createValidator() {
        return new SchoolTaskValidator();
    }

}