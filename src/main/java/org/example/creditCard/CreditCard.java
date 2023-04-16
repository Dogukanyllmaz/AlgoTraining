package org.example.creditCard;

/**
 * A simple model for a consumer credit card.
 * @author H. Doğukan Yılmaz
 */

public class CreditCard {



    //instance variables
    private String customer;
    private String bankName;
    private String customerId;
    private int limit;
    private double balance;


    //Constructors
    public CreditCard(){
    }

    /**
     * Constructs a new credit card instance
     * @param customer the name of the customer (e.g.,"Dogukan Yilmaz")
     * @param bankName  the name of the bank (e.g.,"American Swing")
     * @param customerId the account identifier (e.g.,"5453 0000 8400 0037")
     * @param limit the credit limit (measured in dollars)
     * @param balance the initial balance (measured in dollars)
     */

    public CreditCard(String customer, String bankName, String customerId, int limit, double balance){
        this.customer = customer;
        this.bankName = bankName;
        this.customerId = customerId;
        this.balance = balance;
        this.limit = limit;
    }
    public CreditCard(String customer, String bankName, String customerId, int limit){
        this(customer,bankName,customerId,limit,0.0);  //use a balance of zero as default
    }


    //Accessor Modifier
    public String getCustomer() {
        return customer;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    //methods

    /**
     * Charges the given price to the card, assuming sufficient credit limit.
     * @param price the amount to be charged.
     * @return true if charge was accepted; false if charge was denied.
     */
    public boolean charge(double price){
        if (price + balance > limit)
            return false;
        balance +=price;
        return true;
    }

    /**
     * Processes customer payment that reduces balance.
     * @param amount the amount of payment made.
     */

    public void makePayment(double amount){  //make payment
        if (amount<balance)
            balance -= amount;
    }

    //print a card's information
    public static void printSummary(CreditCard creditCard){
        System.out.println("Customer: "+creditCard.customer);
        System.out.println("Bank: "+creditCard.bankName);
        System.out.println("Customer Id: "+creditCard.customerId);
        System.out.println("Balance: "+creditCard.balance);  //implicit casting
        System.out.println("Limit: "+creditCard.limit);      //implicit casting
    }


    public static void main(String[] args) {

        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Dogukan Yilmaz","American Swing","3456 9876 3827 2734",5000);
        wallet[1] = new CreditCard("Dogukan Yilmaz","California Federal","1234 1234 5678 2534",3500);
        wallet[2] = new CreditCard("Dogukan Yilmaz","California Federal","4236 0023 3230 3230",2500,300);


        for (int i = 1; i <= 16; i++) {
            wallet[0].charge(3*i);
            wallet[1].charge(2*i);
            wallet[2].charge(i);
        }

        for (CreditCard creditCard: wallet) {
            CreditCard.printSummary(creditCard);        // calling the static method
            while (creditCard.getBalance()>200.0){
                creditCard.makePayment(200);
                System.out.println("New balance: " + creditCard.getBalance());
            }
        }


    }






}
