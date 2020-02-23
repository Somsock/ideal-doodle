import java.text.DecimalFormat;
/**
 * This class stores information about a book bundle of a set quantity
 * The variable quantity is the amount of unit of books present in the bundle
 * The variable cost is the total cost of the bundle given by user input 
 * The variable book reference the type of book used in the bundle
 * @author Somsock
 */
public class Bundle{
    private int quantity;
    private double cost;
    private Book book;
    public Bundle(){
        this.quantity = 0;
        this.cost = 0;
        this.book = null;
    }
    /**
     * This is a customized constructor for Bundle
     * @param q is the quantity of books present in this bundle
     * @param c is the cost of the bundle
     * @param b is the book used in the bundle
     */
    public Bundle(int q, double c, Book b){
        this.quantity = q;
        this.cost = c;
        this.book = b;
    }
    /**
     * This method is used to set he book use in the bundle
     * @param b is the 'new' book 
     */
    public void setBook(Book b){
        this.book = b;
    }
    /**
     * This method is used to set the quantity of books in the bundle
     * @param q is the number of books
     */
    public void setQuantity(int q){
        this.quantity = q;
    }
    /**
     * This method returns the number of books in the bundle
     * @return the quantity of books in the bundle
     */
    public int getQuantity(){
        return this.quantity;
    }
    /**
     * This method set the cost of the bundle to variable c
     * @param c the cost of the bundle
     */
    public void setCost(double c){
        //this.cost = Double.parseDouble(df.format(c));
        this.cost = c;
    }
    /**
     * This mehtod returns the cost of the bundle
     * @return the cost of the bundle
     */
    public double getCost(){
        return this.cost;
    }
    /**
     * This method calculates the total possible revenue of the bundle
     * based on the price of the book, quantity of books, and cost of the bundle
     * @return the total possible revenue of the bundle
     */
    public double getTotalRevenue(){
        double totalRevenue = this.book.getPrice()*this.quantity;
        DecimalFormat df = new DecimalFormat("#.##");
        totalRevenue = Double.parseDouble(df.format(totalRevenue));
        return totalRevenue;
    }
    /**
     * This method calculates the potential profit of the book bundle
     * @return the possible profit of the bundle
     */
    public double getProfit(){
        return getTotalRevenue()-this.cost;
    }
    /**
     * This method calculates the unit price/cost for a single book in the bundle
     * @return the unit price for a single book in the bundle
     */
    public double getUnitPrice(){
        double unitPrice = this.cost/this.quantity;
        DecimalFormat df = new DecimalFormat("#.##");
        unitPrice = Double.parseDouble(df.format(unitPrice));
        return unitPrice;
    }
    /**
     * This method calculates the quantity of books that must be sold 
     * in order to at least breakeven and account for the cost to print the books
     * @return the quantity of books that needs to be sold in order to berakeven
     */
    public int getBeQuantity(){
        return (int)Math.round(cost/this.book.getPrice());
    }
    /**
     * This method return the basic information about the bundle in a string fromat
     * The information returned by this method include the number of books
     * and cost to print that quantity of books
     * @return the number of books in the bundle and cost of the bundle in a String
     */
    public String toString(){
        String string = String.format("This bundle contains %d books and costs $%.2f to print.", quantity, cost);
        return string;
    }
    /**
     * This method return all avaliable information about the bundle in a string format
     * The information returned by this method include the following:
     * Bundle Quantity: total number of books in the bundle
     * Bundle Cost: the cost of the bundle
     * Unit Price: the cost of an individual book
     * Breakeven Quantity: the amount of books that needs to be sold to account for cost of bundle
     * Potential Profit: Total Revenue - Total Cost of the bundle
     * Total Revenue: the total revenue of the bundle given by quantity of books * price of book
     * @return the more complex available information of the book bundle 
     */
    public String allString(){
        double totalRevenue = getTotalRevenue();
        double profit = getProfit();
        double unitPrice = getUnitPrice();
        int beQuantity = getBeQuantity();
        String str1 = String.format("\nBundle Quantity: %d\nBundle Cost: $%.2f\nUnit Price: $%.2f", quantity, cost, unitPrice);
        String str2 = String.format("\nBreakeven Quantity: %d\nPotential Profit: $%.2f\nTotal Revenue: $%.2f\n", beQuantity, profit, totalRevenue);
        return str1 + str2;
    }
}
