package factory;

import task.PersonalTask;
import task.Task;
import validator.PersonalTaskValidator;
import validator.TaskValidator;

public class PersonalTaskFactory implements TaskFactory {

    @Override
    public Task createTask(String title, String description) {
        return new PersonalTask(title, description);
    }

    @Override
    public TaskValidator createValidator() {
        return new PersonalTaskValidator();
    }

}