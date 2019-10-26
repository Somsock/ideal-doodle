public class Book{
    private String name;
    private String author;
    private double price;
    private int numPages;
    
    public Book(){
        this.name = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.numPages = 0;
    }
    
    public Book(double p){
        this.price = p;
    }
    
    public Book(String n, String a, double p, int np){
        this.name = n;
        this.author = n;
        this.price = p;
        this.numPages = np;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAuthor(String a){
        this.author = a;
    }
    
    public String getAuthor(String a){
        return this.author;
    }
    
    public void setPrice(double p){
        this.price = p;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setNumPages(int np){
        this.numPages = np;
    }
    
    public int getNumPages(){
        return this.numPages;
    }
    
    public String toString(){
         String string = String.format("Title: %s\nAuthor: %s\nPrice: %f\nNumber of Pages: %d\n", name, author, price, numPages);
         return string;
    }
