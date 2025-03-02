package guru.springframework;

public  class  Money implements Expression {
     protected int amount;
     protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, this.currency) ;
    }
    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    public static Money franc(int amount){
        return  new Money(amount, "CHF");
    }

    public boolean equals(Object o){
        Money money = (Money) o;
        return amount == money.amount && this.currency.equals(money.currency);
    }

    @Override
    public Money reduce(String toCurrency) {
        return this;
    }

    public Expression plus(Money addend){
        return new Sum(this,addend);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
