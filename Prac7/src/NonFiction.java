/**
 * Created by Dale on 14/09/2016.
 */
public class NonFiction extends Book {
   public NonFiction(){}
   public NonFiction(String title) {
      super(title);
      setPrice();
   }

   public void setPrice() {
      super.price = 37.99;
   }
}
