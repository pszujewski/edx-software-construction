package model;

public class FryCook extends Employee {

    public static final double FRYCOOK_WAGE = 5.50;

    private boolean isGrillReady;

    public FryCook(String name, int age, BurgerByte workBranch) {
        super(name, workBranch, age);
        isGrillReady = false;
        workBranch.getManager().hire(this);
    }

    public boolean isGrillReady() { return isGrillReady; }


    @Override
    public void startWork(double hours) {
        isGrillReady = true;
        setAtWork(true);
        logHoursWorked(hours);
        System.out.println("Grill is ready to cook with!");
    }

    @Override
    public void leaveWork() {
        isGrillReady = false;
        setAtWork(false);
        System.out.println("Grill is closed for the day.");
    }

    @Override
    public double getMemberWage() {
        return FRYCOOK_WAGE;
    }
}