package validator;

import task.Task;

public class SchoolTaskValidator implements TaskValidator{

	@Override
	public boolean validate(Task task) {
		
		if (task.getTitle() == null || task.getTitle().trim().isEmpty()) {
            return false;
        }

        return true;
		
	}
	
}
