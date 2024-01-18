package guru.springframework;

public class Sum implements Expression {
    Money augmend;
    Money addend;

    public Sum(Money augmend, Money addend) {
        this.augmend = augmend;
        this.addend = addend;
    }

    public Money reduce(String to){
        int amount = addend.amount + augmend.amount;
        return new Money(amount , to);
    }
}
