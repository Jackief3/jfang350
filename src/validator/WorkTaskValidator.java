package validator;

import task.Task;

public class WorkTaskValidator implements TaskValidator {

    @Override
    public boolean validate(Task task) {

    	if (task.getTitle() == null || task.getTitle().trim().isEmpty()) {
            return false;
        }

        return true;

    }

}
