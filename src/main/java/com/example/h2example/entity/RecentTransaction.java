package com.example.h2example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RecentTransactions")
public class RecentTransaction {
    @Id
    private int id;
    private String name;
    private String assignedName;
    private String occupation;
    private String priority;
    private double budget;

    public RecentTransaction() {

    }

    public RecentTransaction(int id, String name, String assignedName, String occupation, String priority, double budget) {
        this.id = id;
        this.name = name;
        this.assignedName = assignedName;
        this.occupation = occupation;
        this.priority = priority;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAssignedName() {
        return assignedName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPriority() {
        return priority;
    }

    public double getBudget() {
        return budget;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssignedName(String assignedName) {
        this.assignedName = assignedName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
