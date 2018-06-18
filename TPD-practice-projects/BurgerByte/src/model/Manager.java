package model;

import java.util.LinkedList;
import java.util.List;

public class Manager extends Employee {

    public static final double MANAGER_WAGE = 9.50;
    private List<Employee> team;

    public Manager(String name, int age) {
        super(name, null, age);
        team = new LinkedList<>();
    }

    public BurgerByte getManagingBranch() { return workBranch; }

    public List<Employee> getTeam() { return team; }

    public void setManagingBranch(BurgerByte branch) {
        this.workBranch = branch;
    }

    // REQUIRES: hours >= 0
    // MODIFIES: this
    // EFFECTS: opens this Manager's BurgerByte, sets atWork to true, and logs
    //          hours worked
    @Override
    public void startWork(double hours) {
        workBranch.openRestaurant();
        setAtWork(true);
        logHoursWorked(hours);
        System.out.println("We are open for the day!");
    }

    // MODIFIES: this
    // EFFECTS: closes this Manager's BurgerByte, set atWork to false
    @Override
    public void leaveWork() {
        workBranch.closeRestaurant();
        setAtWork(false);
        System.out.println("We are closed for the day!");
    }

    @Override
    public double getMemberWage() { return MANAGER_WAGE; }

    // REQUIRES: e must not be in already in team and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: adds given e to team and this Manager's restaurant
    public void hire(Employee e) {
        workBranch.addStaff(e);
        team.add(e);
        System.out.println("Welcome aboard, " + e.getName() + "!");
    }

    // REQUIRES: e must be in this team and and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: removes given Cashier from team and this Manager's restaurant
    public void fire(Employee e) {
        workBranch.removeStaff(e);
        team.remove(e);
        System.out.println("Sorry to let you go, " + e.getName() + ".");
    }

}