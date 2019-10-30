/**
 * This class mimics a book incuding variables a book might contain such as 
 * The variable name stores the book title
 * The variable author stores the name of the author
 * The variable price is the retail price of the book
 * The variable price will be use by Bundle class to calculate total revenue, profit, and breakeven quantity 
 * The variable intPages stores the number of pages of the book
 *@author Somsock
 */
public class Book{
    private String name;
    private String author;
    private double price;
    private int numPages;
    /**
     * default constructor for Book
     * sets all class variable to "Unknown" or zero
     */
    public Book(){
        this.name = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.numPages = 0;
    }
    /**
     * constructor that only set the price variable of Book
     * this contructor is optimal for if the price of the book is the only known variable
     * the current beta version of self-source-printing only requires book price as a variable
     * @param p is the price of the book
     */
    public Book(double p){
        this.price = p;
    }
    /**
     * customizable constructor for the book
     * @param p is the price of the book
     * @param a is the name of the author
     * @param p is the price 
     * @param np is the number of pages in the book
     */
    public Book(String n, String a, double p, int np){
        this.name = n;
        this.author = n;
        this.price = p;
        this.numPages = np;
    }
    /**
     * This method is use to set or change the title of the book to n
     * @param n is the new name of the book
     */
    public void setName(String n){
        this.name = n;
    }
    /**
     * This method is use to get the title of the book
     * @return the title of the book
     */
    public String getName(){
        return this.name;
    }
    /**
     * This method is use to set or change the name of the author to a
     * @param a is the new name of the author
     */
    public void setAuthor(String a){
        this.author = a;
    }
    /**
     * This method is use to get the name of the author 
     * @return is the name of the author 
     */
    public String getAuthor(){
        return this.author;
    }
    /**
     * This method is use to change or set the price to p
     * @param p is the price of the book
     */
    public void setPrice(double p){
        this.price = p;
    }
    /**
     * This method is used to get the price of the book 
     * @return the price of the book
     */
    public double getPrice(){
        return this.price;
    }
    /**
     *This method is use to change or set the number of pages to np
     *@param np is the new number of pages of the book
     */
    public void setNumPages(int np){
        this.numPages = np;
    }
    /**
     * This method is use to get the number of pages of the book
     * @return the number of pages of the book
     */
    public int getNumPages(){
        return this.numPages;
    }
    /**
     * This method is use to get all the information of the book in String format 
     * @return the title, author, price, and number of pages of the book 
     */
    public String toString(){
         String string = String.format("Title: %s\nAuthor: %s\nPrice: %f\nNumber of Pages: %d\n", name, author, price, numPages);
         return string;
    }
