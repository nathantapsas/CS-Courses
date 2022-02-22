package com.company;

public interface Priority {
    enum PriorityLevel {LOW, MEDIUM, HIGH, URGENT, CRITICAL};
    void setPriority(PriorityLevel newPriority);
    PriorityLevel getPriority();
}
