import javax.swing.*;

/**
 * Created by Dale on 14/09/2016.
 */
public class BookArray {
   static Book[] array = new Book[10];

   public static void main(String[] args) {
      buildArray();
      displayArray();
   }

   private static void displayArray() {

      for (Book book : array){//int x=0; x<array.length;x++){
         System.out.println("The Book: " + book.getTitle() + " costs: " + book.getPrice());
      }
   }

   private static void buildArray() {
      char bookType;
      String name;
      for (int x=0; x<array.length; x++) {
         bookType = getBook();
         name = JOptionPane.showInputDialog("Input Title");
         if (bookType == 'n') {
            array[x] = new NonFiction(name);
         }
         else if (bookType == 'f') {
            array[x] = new Fiction(name);
         }
      }
   }

   public static char getBook() {
      String bookType;
      bookType = JOptionPane.showInputDialog("Entre Book type, 'n' for non-fiction and 'f' for fiction");
      return bookType.charAt(0);
   }
}
