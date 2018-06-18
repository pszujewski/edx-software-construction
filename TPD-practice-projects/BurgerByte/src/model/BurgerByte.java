package model;

import java.util.LinkedList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private List<Employee> staff;
    private boolean isOpen;

    public BurgerByte(String locn, Manager manager) {
        location = locn;
        this.manager = manager;
        manager.setManagingBranch(this);
        staff = new LinkedList<>();
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() { return staff; }
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : staff) {
            e.leaveWork();
        }
    }

    // REQUIRES: c must not be in this staff or this BurgerByte's Manager's team
    // MODIFIES: this
    // EFFECTS: adds the given employee to this staff
    public void addStaff(Employee e) {
        staff.add(e);
    }

    // REQUIRES: c must be in this staff and this BurgerByte's Manager's team
    // MODIFIES: this
    // EFFECTS: removes the given employee from this staff
    public void removeStaff(Employee e) {
        staff.remove(e);
    }

    private void printWageInfo(Employee e) {
        System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
    }

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    public void computeStaffWages() {
        for (Employee e : staff) {
            printWageInfo(e);
        }
        printWageInfo(manager);
    }


}