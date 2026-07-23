# jfang350

SE 350 Project

**SPRINT 1**

– Are you in a Group?

No


– If so, who else is in your group?

Just Me


– Do you have your GitHub account set up?

Yes


– Do you have a public repository for your Project?

Yes its public.


– What is the link to your GitHub repository?

https://github.com/Jackief3/jfang350


– If you are in a group, does everyone have write access to the github repo?

Not in a group


– Do you have a “Hello World” program that compiles and runs?

Yes


– Where is the entry point to your project? (src/main/Main.java for example)?

The entry point is src/main/Main just like yours in the video.


**SPRINT 2**

The project I've decided to go with is a task management system.

This project will be a Java-based task management application that allows users to create, edit, organize, prioritize, and complete tasks through a simple menu-driven interface.

Core features of the app are the following:
- Create Tasks
- Edit Tasks
- View Tasks
- Delete Tasks
- Mark Tasks Complete
- Exit


**SPRINT 3**

Design Pattern #1: Abstract Factory
The Abstract Factory pattern is used to create different families of related objects in the task management system. Each concrete factory creates both a specific type of Task and its corresponding TaskValidator.

#### Purpose

The Abstract Factory pattern allows the app to create different types of tasks with corresponding validators without the client depending on concrete classes. The client interacts only with the TaskFactory interface, making the code easier to extend and maintain.

#### Classes Used

- TaskFactory (Abstract Factory Interface)
- WorkTaskFactory (Concrete Factory)
- SchoolTaskFactory (Concrete Factory)
- PersonalTaskFactory (Concrete Factory)


- Task (Abstract Product)
- WorkTask (Concrete Product)
- SchoolTask (Concrete Product)
- PersonalTask (Concrete Product)


- TaskValidator (Abstract Product Interface)
- WorkTaskValidator (Concrete Product)
- SchoolTaskValidator (Concrete Product)
- PersonalTaskValidator (Concrete Product)


- Menu (Client)

  


