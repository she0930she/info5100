package Q3;

public class ShoppingCart {
    private int total;
//    private CreditCard creditCard;
//    private PayPal paypal;

    public ShoppingCart() {
        total=0;
    }
    public void addItem(Item item){
        total += item.getPrice();
    }
    public void removeItem(Item item){
        total -= item.getPrice();
    }
    public int calculateTotal(){
        return total;
    }

    public void pay(PayPal paypal){
        int tmp= this.calculateTotal();
        paypal.pay(tmp );

    }
    public void pay(CreditCard creditCard){
        int tmp= this.calculateTotal();
        creditCard.pay(tmp );

    }
}
