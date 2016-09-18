/**
 * Created by Dale on 14/09/2016.
 */
public class Fiction extends Book {
   public Fiction() {}
   public Fiction(String title) {
      super(title);
      setPrice();
   }

   public void setPrice() {
      super.price = 24.99;
   }
}
