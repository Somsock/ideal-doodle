import java.text.DecimalFormat;
public class Bundle{
    private int quantity;
    private double cost;
    private Book book;
    public Bundle(){
        this.quantity = 0;
        this.cost = 0;
        this.book = null;
    }
    public Bundle(int q, double c, Book b){
        this.quantity = q;
        this.cost = c;
        this.book = b;
    }
    public void setBook(Book b){
        this.book = b;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setCost(double c){
        //this.cost = Double.parseDouble(df.format(c));
        this.cost = c;
    }
    public double getCost(){
        return this.cost;
    }
    public double getTotalRevenue(){
        double totalRevenue = this.book.getPrice()*this.quantity;
        DecimalFormat df = new DecimalFormat("#.##");
        totalRevenue = Double.parseDouble(df.format(totalRevenue));
        return totalRevenue;
    }
    public double getProfit(){
        return getTotalRevenue()-this.cost;
    }
    public double getUnitPrice(){
        double unitPrice = this.cost/this.quantity;
        DecimalFormat df = new DecimalFormat("#.##");
        unitPrice = Double.parseDouble(df.format(unitPrice));
        return unitPrice;
    }
    public int getBeQuantity(){
        return (int)Math.round(cost/this.book.getPrice());
    }
    public String toString(){
        String string = String.format("This bundle contains %d books and costs $%.2f to print.", quantity, cost);
        return string;
    }
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
