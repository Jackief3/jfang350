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

Here is the UML diagram for the Abstract Factory Design Pattern:
<img width="600" height="419" alt="AbstractFactoryUML" src="https://github.com/user-attachments/assets/60c20fdf-9929-42c8-84c3-624406ee7e20" />


Design Pattern #2: Command

The Command design pattern is used to encapsulate user actions as command objects. Instead of the `Menu` class directly performing operations such as adding or viewing tasks, it creates and executes command objects. This separates the user interface from the business logic, making the application easier to extend and maintain.


### Purpose

The Command pattern encapsulates each menu action into its own command object. The `Menu` class acts as the invoker by creating and executing commands, while the `TaskManager` acts as the receiver that performs the requested operations. This design reduces coupling between the user interface and the application's functionality, making it easier to add new commands in the future.


### Classes Used

- Command (Command)
- AddTaskCommand (Concrete Command)
- ViewTasksCommand (Concrete Command)
- ExitCommand (Concrete Command)
- TaskManager (Receiver)
- Menu (Invoker/Client)




