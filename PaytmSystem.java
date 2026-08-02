class Paytm {

    int paymentId;
    double amount;

    void pay() {
        System.out.println("Processing Payment...");
    }

    void displayDetails() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount : " + amount);
    }
}
class Upi extends Paytm {

    String upiId;

    void verifyUPI() {
        System.out.println("Verifying UPI ID...");
        System.out.println("UPI Verified Successfully");
    }

    @Override
    void pay() {
        verifyUPI();
        System.out.println("Payment Method : UPI");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Payment Successful");
    }
}
class CreditCardPayment extends Paytm {

    String cardNumber;
    String cardHolderName;

    void validateCard() {
        System.out.println("Validating Card...");
        System.out.println("Card Verified Successfully");
    }

    @Override
    void pay() {
        validateCard();
        System.out.println("Payment Method : Credit Card");
        System.out.println("Card Holder : " + cardHolderName);
        System.out.println("Payment Successful");
    }
}
class NetBankingPayment extends Paytm {

    String bankName;
    String accountNumber;

    void loginToBank() {
        System.out.println("Logging into Bank...");
        System.out.println("Login Successful");
    }

    @Override
    void pay() {
        loginToBank();
        System.out.println("Payment Method : Net Banking");
        System.out.println("Bank : " + bankName);
        System.out.println("Payment Successful");
    }
}public class PaytmSystem {

    public static void main(String[] args) {

        Upi upi = new Upi();
        upi.paymentId = 101;
        upi.amount = 1000;
        upi.upiId = "ashwini@oksbi";
        upi.displayDetails();
        upi.pay();

        System.out.println();

        CreditCardPayment card = new CreditCardPayment();
        card.paymentId = 102;
        card.amount = 2500;
        card.cardHolderName = "Ashwini";
        card.cardNumber = "1234567812345678";
        card.displayDetails();
        card.pay();

        System.out.println();

        NetBankingPayment net = new NetBankingPayment();
        net.paymentId = 103;
        net.amount = 5000;
        net.bankName = "SBI";
        net.accountNumber = "1234567890";
        net.displayDetails();
        net.pay();
    }
}