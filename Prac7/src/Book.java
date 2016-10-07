/**
 * Created by Dale Muccignat on 14/09/2016.
 */
public abstract class Book {
   protected String title;
   protected Double price;

   public Book(){}

   public Book(String title) {
      this.title = title;
      System.out.println("blah");
   }

   public String getTitle() {
      return title;
   }

   public Double getPrice() {
      return price;
   }

   public abstract void setPrice();
}
