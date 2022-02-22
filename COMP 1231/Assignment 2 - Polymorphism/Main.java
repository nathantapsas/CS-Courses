package com.company;
import java.util.Arrays;
import static com.company.Priority.PriorityLevel.*;

public class Main {

    public static void main(String[] args) {
        Task[] tasks = {
                new Task("wash dishes", HIGH),
                new Task("clean bedroom", MEDIUM),
                new Task("walk the dog", LOW),
                new Task("do homework", URGENT),
                new Task("email boss", MEDIUM),
                new Task("book holiday", LOW)
        };
        // Show the sorting ability inherited from the Comparable interface.
        System.out.println("Tasks ordered from most important to least important.");
        Arrays.stream(tasks).sorted().forEach(System.out::println);

        // Show the getPriority and setPriority methods
        System.out.printf("\n\nTask: %s\t\t\tCurrent priority: %s", tasks[4].getTask(), tasks[4].getPriority());
        tasks[4].setPriority(CRITICAL);
        System.out.printf("\nTask: %s\t\t\tNew priority: %s\n\n", tasks[4].getTask(), tasks[4].getPriority());

        System.out.println("Tasks ordered from most important to least important.");
        Arrays.stream(tasks).sorted().forEach(System.out::println);
    }
}
