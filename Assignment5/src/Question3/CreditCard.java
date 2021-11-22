package Question3;

public class CreditCard implements iPaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("CreditCard : $" + amount);
    }

    private String cardNumber;
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
}
