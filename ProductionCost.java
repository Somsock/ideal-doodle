import javax.swing.*;

public class ProductionCost {
     public static void main(String[] args){
         run();
     }
     
     public static void run(){
         JOptionPane.showMessageDialog(null, "This is a program designed to help you calculate how many book you need to sell to breakeven.");
         Bundle one = new Bundle();
         one.setQuantity(getValidInt("How many books will you order?"));
         one.setCost(getValidDouble("According to your printer, how much will it cost to produce this many books?"));
         Book book = new Book(getValidDouble("How much will you be selling the book for?"));
         one.setBook(book);
         JOptionPane.showMessageDialog(null, "You will need to sell at least " + one.getBeQuantity() + " books to make back your production costs.");
         int choice = JOptionPane.showConfirmDialog(null, "Would you like to see all details of this bundle?");
         if(choice == JOptionPane.YES_OPTION)
             JOptionPane.showMessageDialog(null, "Here is your bundle information." + one.allString());
     }
     private static int getValidInt(String prompt){
         boolean validInput = false;
         int count = 0;
         int num = 0;
         String input;
         while(!validInput){
             try{
                 //num = Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
                 input = JOptionPane.showInputDialog(null, prompt);
                 if(input.equals(JOptionPane.CANCEL_OPTION)){
                    break;
                 }
                 num = Integer.parseInt(input);
                 if(num > 0){
                    validInput = true;
                 }
             }catch (NumberFormatException e){
                 count++;
                 if(count%5 == 0)
                 JOptionPane.showMessageDialog(null, "Please enter a valid number.");
             }
         }
         return num;
     }
     
     private static double getValidDouble(String prompt){
         boolean validInput = false;
         int count = 0;
         double num = 0;
         String input;
         while(!validInput){
             try{
                 //num = Double.parseDouble(JOptionPane.showInputDialog(null, prompt));
                 input = JOptionPane.showInputDialog(null, prompt);
                 if(input.equals(JOptionPane.CANCEL_OPTION)){
                    break;
                 }
                 num = Double.parseDouble(input);
                 if(num > 0){
                    validInput = true;
                 }
             }catch (NumberFormatException e){
                 count++;
                 if(count%5 == 0)
                 JOptionPane.showMessageDialog(null, "Please enter a valid number.");
             }
         }
         return num;
     }
}
