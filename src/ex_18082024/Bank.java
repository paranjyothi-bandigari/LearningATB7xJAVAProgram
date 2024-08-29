package ex_18082024;

public class Bank {
   private  String Currency;
   private Integer Amount;

    public Bank(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer add(Bank bankName) {
        if (!bankName.Currency.equalsIgnoreCase("INR")) {
            // throw exception that it is not supported - USD, gBP + INR
            try {
                throw new Exception("Currency Doesn't Match!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        Integer sum = this.Amount + bankName.Amount;
        return sum;
    }
}
