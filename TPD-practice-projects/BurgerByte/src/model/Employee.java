package model;

public abstract class Employee {
    public static final double BASE_WAGE = 10.00;
    protected String name;
    protected int age;
    protected BurgerByte workBranch;
    private double hoursWorked;
    private boolean atWork;

    public Employee(String name, BurgerByte workBranch, int age) {
        this.name = name;
        this.workBranch = workBranch;
        this.age = age;
    }

    // getters
    public String getName() { return name; }

    public int getAge() { return age; }

    public boolean isAtWork() { return atWork; }

    public BurgerByte getWorkPlace() { return workBranch; }

    public void setAtWork(boolean atWork) { this.atWork = atWork; }

    public double getHoursWorked() { return hoursWorked; }

    // MODIFIES: this
    // EFFECTS: adds hours to the hoursWorked field
    public void logHoursWorked(double hours) {
        hoursWorked += hours;
    }

    // EFFECTS: the grill should be ready to go, hours should be logged, and
    //          the atWork field should be updated to reflect this FryCook's status
    abstract public void startWork(double hours);

    // EFFECTS: close the grill for the day, and update this FryCook's work status
    abstract public void leaveWork();

    abstract public double getMemberWage();

    // EFFECTS: computes wages for the day
    public double computeWage() {
        return hoursWorked * (getMemberWage() + BASE_WAGE);
    }
}
