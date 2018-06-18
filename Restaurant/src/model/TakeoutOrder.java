package model;

public class TakeoutOrder {
    private int ticketNumber;
    private String customerName;
    private String status;
    private char comboId;
    private String instructions;

    // Constructor
    // EFFECTS: Instantiates one Takeout order object
    public TakeoutOrder(int num, String name) {
        ticketNumber = num;
        customerName = name;
    }

    // EFFECTS: Produces true if the orders is complete
    public boolean isOrderComplete() {
        return status == "complete";
    }

    // EFFECTS: Matches a comboId to a price
    public double getPriceByCombo() {
        switch(comboId) {
            case 'A':
                return 2.50;
            case 'B':
                return 3.00;
            case 'C':
                return 3.50;
            default:
                return 0.00;
        }
    }

    public void printKitchenTicket() {
        System.out.println("Kitchen Ticket For Customer " + getCustomerName());
        System.out.println("Order is still in progress");
        System.out.println("Pending order for combo: " + getComboId());
    }

    public void printReceipt() {
        System.out.println("Receipt For Customer " + getCustomerName());
        System.out.println("Order complete for combo: " + getComboId());
        System.out.println("Total price for combo: " + getPriceByCombo());
    }

    public void printStatus () {
        if (isOrderComplete()) {
            printReceipt();
        } else {
            printKitchenTicket();
        }
    }

    // Getters
    public String getCustomerName() { return customerName; }
    public char getComboId() { return comboId; }

    // Setters
    public void setOrderParams(String status, char comboId, String instructions) {
        this.status = status;
        this.comboId = comboId;
        this.instructions = instructions;
    }

}
