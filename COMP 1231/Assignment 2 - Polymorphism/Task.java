package com.company;

public class Task implements Priority, Comparable<Task> {

    private PriorityLevel priority;
    private String task;

    public Task(String task, PriorityLevel priority) {
        this.task = task;
        this.priority = priority;
    }
    // Public getter and setter methods
    public String getTask() {
        return this.task;
    }
    public void setTask(String newTask) {
        this.task = newTask;
    }

    // Implement methods inherited from interfaces.
    @Override
    public int compareTo(Task other) {
       if(this.priority.ordinal() < other.priority.ordinal()) return 1;
       else if(this.priority.ordinal() > other.priority.ordinal()) return -1;
       return 0;
    }

    @Override
    public void setPriority(PriorityLevel newPriority) {
        this.priority = newPriority;
    }

    @Override
    public PriorityLevel getPriority() {
        return this.priority;
    }
    // Override method inherited from super class.
    @Override
    public String toString() {
        return String.format("Task: %s\t\t\tPriority: %s", this.task, this.priority);
    }
}
