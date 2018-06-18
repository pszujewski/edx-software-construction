package model;

public class Cashier extends Employee {

    public static final double CASHIER_WAGE = 6.50;

    private boolean isRegisterOpen;

    public Cashier(String name, int age, BurgerByte workBranch) {
        super(name, workBranch, age);
        isRegisterOpen = false;
        workBranch.getManager().hire(this);
    }

    public boolean isRegisterOpen() { return isRegisterOpen; }

    // EFFECTS: sets isRegisterOpen to true, and updates atWork to reflect that this Cashier is
    //          now at work
    @Override
    public void startWork(double hours) {
        isRegisterOpen = true;
        setAtWork(true);
        logHoursWorked(hours);
        System.out.println("Register open!");
    }

    // EFFECTS: sets isRegisterOpen to false and updates atWork to reflect that this Cashier is
    //          no longer at work
    @Override
    public void leaveWork() {
        isRegisterOpen = false;
        setAtWork(false);
        System.out.println("Register closed, can't take any more orders.");
    }

    @Override
    public double getMemberWage() {
        return CASHIER_WAGE;
    }

}