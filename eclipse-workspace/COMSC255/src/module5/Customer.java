package module5;

public class Customer {
    private String name;
    private int customerID;
    private String address;
    private static int customerCount = 0;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.customerID = customerCount++;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Address: " + address);
    }

    public static int getCustomerCount() {
        return customerCount;
    }
}
