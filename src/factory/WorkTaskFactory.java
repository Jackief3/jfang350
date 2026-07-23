package factory;

import task.Task;
import task.WorkTask;
import validator.TaskValidator;
import validator.WorkTaskValidator;

public class WorkTaskFactory implements TaskFactory {

    @Override
    public Task createTask(String title, String description) {
        return new WorkTask(title, description);
    }

    @Override
    public TaskValidator createValidator() {
        return new WorkTaskValidator();
    }

}